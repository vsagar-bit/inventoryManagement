package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;

public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Long> {

}
