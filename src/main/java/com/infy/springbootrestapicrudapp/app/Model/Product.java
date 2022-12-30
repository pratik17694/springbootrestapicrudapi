package com.infy.springbootrestapicrudapp.app.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
      @Id
	private Integer productID;
	private String productName;
	private Double productPrice;
	@ManyToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
}
