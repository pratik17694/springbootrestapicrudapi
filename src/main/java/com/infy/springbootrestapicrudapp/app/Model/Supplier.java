package com.infy.springbootrestapicrudapp.app.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {

	@Id
	private Integer supplierID;
	private String supplierName;
	private long supplierContact;
}
