package com.infy.springbootrestapicrudapp.app.dto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import com.infy.springbootrestapicrudapp.app.Model.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	private Integer productID;
	private String productName;
	private Double productPrice;
	private Supplier supplier;
}
