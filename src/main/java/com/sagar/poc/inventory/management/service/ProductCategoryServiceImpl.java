package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;
import com.sagar.poc.inventory.management.jpa.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

	@Override
	public ProductCategory createProductCategory(ProductCategory productCategory) {
		return productCategoryRepository.save(productCategory);
	}

	@Override
	public Optional<ProductCategory> getProductCategory(Long id) {
		
		return productCategoryRepository.findById(id);
	}

	@Override
	public List<ProductCategory> listOfProdctCategories() {
		
		return (List<ProductCategory>) productCategoryRepository.findAll();
	}

	@Override
	public ProductCategory getByName(String name) {
		
		return productCategoryRepository.getByName(name);
	}
	
}
