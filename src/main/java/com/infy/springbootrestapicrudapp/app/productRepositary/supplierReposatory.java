package com.infy.springbootrestapicrudapp.app.productRepositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrudapp.app.Model.Supplier;

@Repository
public interface supplierReposatory  extends CrudRepository<Supplier, Integer>{

}
