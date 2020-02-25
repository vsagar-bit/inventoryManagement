package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;

public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Long> {

	@Query(nativeQuery = true, value = "select * from ProductCategory where PRODUCTCATOGORY_NAME = ?1")
	public ProductCategory getByName(String name);
	
}
