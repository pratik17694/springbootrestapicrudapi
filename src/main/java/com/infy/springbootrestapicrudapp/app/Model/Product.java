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
public class Product {
      @Id
	private Integer productID;
	private String productName;
	private Double productPrice;
	
}
