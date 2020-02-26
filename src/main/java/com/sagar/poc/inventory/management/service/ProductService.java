package com.sagar.poc.inventory.management.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.sagar.poc.inventory.management.jpa.entity.Product;

public interface ProductService {
	
	public Product createProduct(Product product);
	public Optional<Product> getProduct(Long id);
	public List<Product> listOfProducts();
	public List<Product> getByBrandIdAndType(Long brandId, Long categoryId);
	public List<Product> getByColorAndType(String color, Long categoryId);
	public List<Product> getByPriceAndType(Long price, Long categoryId);
	public List<Product> getBySizeAndType(String size, Long categoryId);
	public BigInteger getCountBySellerId(Long sellerId);
	public void deleteBySellerId(Long sellerId);
	public void deleteByBrandId(Long brandId);
}
