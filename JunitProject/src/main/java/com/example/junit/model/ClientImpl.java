package com.example.junit.model;

import java.math.BigDecimal;
import java.util.List;

public class ClientImpl implements Client {
	
	private long id;
	private String name;
	private ClientType type;
	private List<Collateral> collaterals;
	private List<Product> products;
	private BigDecimal productAmount;

	public ClientImpl(long id, String name, ClientType type, List<Collateral> collaterals, List<Product> products,
			BigDecimal productAmount) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.collaterals = collaterals;
		this.products = products;
		this.productAmount = productAmount;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ClientType getType() {
		return type;
	}
	
	public void setType(ClientType type) {
		this.type = type;
	}

	public List<Collateral> getCollaterals() {
		return collaterals;
	}
	
	public void setCollaterals(List<Collateral> collaterals) {
		this.collaterals = collaterals;
	}

	public List<Product> getProduct() {
		return products;
	}
	
	public void setProduct(List<Product> products) {
		this.products = products;
	}

	public void setProductAmount(BigDecimal productAmount) {
		this.productAmount = productAmount;
	}
	
	public BigDecimal getProductAmount() {
		return productAmount;
	}

}
