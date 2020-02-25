package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.poc.inventory.management.jpa.entity.Product;
import com.sagar.poc.inventory.management.jpa.repository.ProductRepository;

@Service
public class ProductServiceImpl implements  ProductService {

    @Autowired
    ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> getProduct(Long id) {
		
		return productRepository.findById(id);
	}

	@Override
	public List<Product> listOfProducts() {
		
		return (List<Product>) productRepository.findAll();
	}

}
