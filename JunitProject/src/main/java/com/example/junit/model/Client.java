package com.example.junit.model;

import java.math.BigDecimal;
import java.util.List;

public interface Client {
	
	long getId();
	
	String getName();
	
	Enum<?> getType();
	
	List<Collateral> getCollaterals();
	
	List<Product> getProduct();
	
	void setProductAmount(BigDecimal productAmount);
	
	BigDecimal getProductAmount();

}
