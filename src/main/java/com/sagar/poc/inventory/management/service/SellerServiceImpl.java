package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.poc.inventory.management.jpa.entity.Product;
import com.sagar.poc.inventory.management.jpa.entity.Seller;
import com.sagar.poc.inventory.management.jpa.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerRepository sellerRepo;
	
	@Override
	public Seller createSeller(Seller seller) {
		
		return sellerRepo.save(seller);
	}

	@Override
	public Optional<Seller> getSellerById(Long id) {
		
		return sellerRepo.findById(id);
	}

	@Override
	public List<Seller> getAllSellers() {
		
		return (List<Seller>) sellerRepo.findAll();
	}

	@Override
	public List<Product> getProductsBySellerId() {
		
		return null;
	}
	

}
