package com.sagar.poc.inventory.management.service;

import java.math.BigInteger;
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

	@Override
	public List<Product> getByBrandIdAndType(Long brandId, Long categoryId) {
		
		return productRepository.getByBrandIdAndType(brandId, categoryId);
	}

	@Override
	public List<Product> getByColorAndType(String color, Long categoryId) {
		
		return productRepository.getByColorAndType(color, categoryId);
	}

	@Override
	public List<Product> getByPriceAndType(Long price, Long categoryId) {
		
		return productRepository.getByPriceAndType(price, categoryId);
	}

	@Override
	public List<Product> getBySizeAndType(String size, Long categoryId) {
		
		return productRepository.getBySizeAndType(size, categoryId);
	}

	@Override
	public void deleteBySellerId(Long sellerId) {
		
		productRepository.deleteBySellerId(sellerId);
	}

	@Override
	public void deleteByBrandId(Long brandId) {
		
		productRepository.deleteByBrandId(brandId);
	}

	@Override
	public BigInteger getCountBySellerId(Long sellerId) {
		
		return productRepository.getCountBySellerId(sellerId);
	}

}
