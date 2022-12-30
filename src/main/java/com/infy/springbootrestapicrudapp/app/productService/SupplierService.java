package com.infy.springbootrestapicrudapp.app.productService;

import com.infy.springbootrestapicrudapp.app.Model.Supplier;

public interface SupplierService {

	public Supplier saveSupplierData(Supplier supplier);

	public Iterable<Supplier> getSupplierData();

	

}
