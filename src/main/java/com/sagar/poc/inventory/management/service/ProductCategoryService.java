package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;

public interface ProductCategoryService {

	public ProductCategory createProductCategory(ProductCategory productCategories);
	public Optional<ProductCategory> getProductCategory(Long id);
	public List<ProductCategory> listOfProdctCategories();
	public ProductCategory getByName (String name);
	
}
