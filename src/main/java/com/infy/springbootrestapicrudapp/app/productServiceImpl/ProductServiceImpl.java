package com.infy.springbootrestapicrudapp.app.productServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.Model.Product;
import com.infy.springbootrestapicrudapp.app.productRepositary.ProductRepositary;
import com.infy.springbootrestapicrudapp.app.productService.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepositary productRepositary;
	
	@Override
	public Product saveProduct(Product product) {
		
		productRepositary.save(product);
		return product;
		}

	@Override
	public Iterable<Product> getAllData() {
		
		return productRepositary.findAll();
	}

	@Override
	public Optional<Product> editData(Integer productID) {
		
		
		return productRepositary.findById(productID);
	}

	@Override
	public void deleteData(Integer productID) {
		
	productRepositary.deleteById(productID);
		
	}

	@Override
	public Optional<Product> checkData(Integer productID) {
		
		Optional<Product> optional= productRepositary.findById(productID);
		return optional;
	}

	
	

}
