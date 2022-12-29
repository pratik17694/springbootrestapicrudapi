package com.infy.springbootrestapicrudapp.app.productRepositary;

import org.springframework.data.repository.CrudRepository;

import com.infy.springbootrestapicrudapp.app.Model.Product;

public interface ProductRepositary extends CrudRepository<Product, Integer>{

}
