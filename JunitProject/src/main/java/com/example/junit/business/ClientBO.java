package com.example.junit.business;

import java.util.List;

import com.example.junit.business.Exception.DifferentCurrenciesException;
import com.example.junit.model.Amount;

import com.example.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException;
}
