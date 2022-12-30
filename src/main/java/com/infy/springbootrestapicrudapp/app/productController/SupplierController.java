package com.infy.springbootrestapicrudapp.app.productController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudapp.app.Model.Supplier;
import com.infy.springbootrestapicrudapp.app.productService.SupplierService;

@CrossOrigin("*")
@RequestMapping("/sapi")
@RestController
public class SupplierController {

	@Autowired
	SupplierService ss;
	
	@PostMapping("/supplier")
	public ResponseEntity<Supplier> postSupplier(@RequestBody Supplier supplier)
	{
		Supplier supplier2= ss.saveSupplierData(supplier);
		return new ResponseEntity<Supplier>(supplier2, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getsupplier")
	public ResponseEntity<Iterable<Supplier>> getSupplierData()
	{
		Iterable<Supplier> iterableSupplier = ss.getSupplierData();
		return new ResponseEntity<Iterable<Supplier>>(iterableSupplier, HttpStatus.OK);
		
	}
	
}
