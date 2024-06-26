package com.example.junit.business;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.junit.model.Product;
import com.example.junit.model.ProductImpl;
import com.example.junit.model.ProductType;
import com.example.junit.business.Exception.DifferentCurrenciesException;
import com.example.junit.model.Amount;
import com.example.junit.model.AmountImpl;
import com.example.junit.model.Currency;

public class ClientBOTest {
	
	private ClientBO clientBO = new ClientBOImpl();

	@Test
	public void testClientProductSum() throws DifferentCurrenciesException {
		List<Product> products = new ArrayList<Product>();
		products.add(new ProductImpl(100, "Product 15", 
				ProductType.BANK_GUARANTEE, new AmountImpl(
						new BigDecimal("5.0"), Currency.EURO)));
		products.add(new ProductImpl(120, "Product 20", 
				ProductType.BANK_GUARANTEE, new AmountImpl(
						new BigDecimal("6.0"), Currency.EURO)));
		
		Amount temp = clientBO.getClientProductsSum(products);
		
		assertEquals(Currency.EURO, temp.getCurrency());
		assertEquals(new BigDecimal("11.0"), temp.getValue());
	}
	
	@Test(expected = DifferentCurrenciesException.class)
	public void testClientProductSum1() throws DifferentCurrenciesException {
		List<Product> products = new ArrayList<Product>();
		products.add(new ProductImpl(100, "Product 15", 
				ProductType.BANK_GUARANTEE, new AmountImpl(
						new BigDecimal("5.0"), Currency.INDIAN_RUPEE)));
		products.add(new ProductImpl(120, "Product 20", 
				ProductType.BANK_GUARANTEE, new AmountImpl(
						new BigDecimal("6.0"), Currency.EURO)));
		
		@SuppressWarnings("unused")
		Amount temp = null;
		temp = clientBO.getClientProductsSum(products);
	}
	
	@Test
	public void testClientProductSum2() {
		List<Product> products = new ArrayList<Product>();
		
		Amount temp = null;
		
		try {
			temp = clientBO.getClientProductsSum(products);
		} catch (DifferentCurrenciesException e) {
		}
		
		assertEquals(Currency.EURO, temp.getCurrency());
		assertEquals(BigDecimal.ZERO, temp.getValue());
	}

}
