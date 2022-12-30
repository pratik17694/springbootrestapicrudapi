package com.infy.springbootrestapicrudapp.app.productService;

import java.util.Optional;

import com.infy.springbootrestapicrudapp.app.Model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public Iterable<Product> getAllData();

	public Optional<Product> editData(Integer productID);

	public void deleteData(Integer productID);

	

	public Optional<Product> checkData(Integer productID);

	

}
