package com.infy.springbootrestapicrudapp.app.productServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.Model.Supplier;
import com.infy.springbootrestapicrudapp.app.productRepositary.supplierReposatory;
import com.infy.springbootrestapicrudapp.app.productService.SupplierService;

@Service
public class SupplierServiceIMPL implements SupplierService {

	@Autowired
	supplierReposatory sr;
	
	
	@Override
	public Supplier saveSupplierData(Supplier supplier) {
		
		sr.save(supplier);
		return supplier;
	}


	@Override
	public Iterable<Supplier> getSupplierData() {
		
		return sr.findAll();
	}

}
