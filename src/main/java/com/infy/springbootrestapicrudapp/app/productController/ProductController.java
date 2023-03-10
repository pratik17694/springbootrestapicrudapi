package com.infy.springbootrestapicrudapp.app.productController;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudapp.app.Model.Product;
import com.infy.springbootrestapicrudapp.app.Response.ApiErrorResponse;
import com.infy.springbootrestapicrudapp.app.Response.BaseResponse;
import com.infy.springbootrestapicrudapp.app.productService.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping(value = "/product")
	public ResponseEntity<BaseResponse<Product>> saveProduct(@RequestBody Product product)
	{
		Product product2 =productService.saveProduct(product);
		BaseResponse<Product> baseResponse= new BaseResponse<Product>(201, "Data Saved Successfully",product2);
		return new ResponseEntity<BaseResponse<Product>>(baseResponse, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getProduct")
	public ResponseEntity<BaseResponse<Iterable<Product>>> getAllData()
	{
		Iterable<Product> iterableProduct = productService.getAllData();
		BaseResponse<Iterable<Product>> baseResponse= new BaseResponse<Iterable<Product>>(200,"Data Fetched Successfully",iterableProduct);
		return new ResponseEntity<BaseResponse<Iterable<Product>>>(baseResponse, HttpStatus.OK);
	}
	
	@GetMapping(value = "/gets/{productID}")
	public ResponseEntity<BaseResponse<Optional<Product>>> getSingleData(@PathVariable("productID") Integer productID)
	{
		Optional<Product> getSingleData= productService.checkData(productID);
		BaseResponse<Optional<Product>> baseResponse= new BaseResponse<Optional<Product>>(200, "fetching single data", getSingleData);
		return new ResponseEntity<BaseResponse<Optional<Product>>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ApiErrorResponse> handleUserNotPresent()
	{
		ApiErrorResponse apiErrorResponse= new ApiErrorResponse(404, "user Not Present !", new Date());
		return new ResponseEntity<ApiErrorResponse>(apiErrorResponse,HttpStatus.NOT_FOUND);
		
	}
	
	@PutMapping(value = "/product/{productID}")
	public ResponseEntity<BaseResponse<Product>> editProduct(@PathVariable("productID") Integer productID, @RequestBody Product product)
	{
		Optional<Product> product1 = productService.editData(productID);
		if(product1.isPresent())
		{
			product.setProductID(product1.get().getProductID());
			Product product2 = productService.saveProduct(product);
			BaseResponse<Product> baseResponse= new BaseResponse<Product>(201, "Data Edited successfully", product2);
			
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, HttpStatus.CREATED);
		}
		
		return null;
	}
	
	@DeleteMapping(value = "/delete/{productID}")
	public void deletData(@PathVariable("productID") Integer productID)
	{
		Optional<Product> product = productService.editData(productID);
		if(product.isPresent())
		{
			productService.deleteData(productID);
		}
	}
}
