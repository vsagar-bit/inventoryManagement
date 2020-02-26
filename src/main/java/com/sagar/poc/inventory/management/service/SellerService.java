package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import com.sagar.poc.inventory.management.jpa.entity.Product;
import com.sagar.poc.inventory.management.jpa.entity.Seller;

public interface SellerService {

	public Seller createSeller (Seller seller);
	
	public Optional<Seller> getSellerById (Long id);
	
	public List<Seller> getAllSellers ();
	
	public List<Product> getProductsBySellerId ();
	
	public void deleteSellerById(Long id);
}
