package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.Brand;

public interface BrandRepository extends PagingAndSortingRepository<Brand, Long> {
	
	@Query(nativeQuery = true, value = "select * from Brand where BRAND_NAME = ?1")
	public Brand getBrandByName(String name);
	
}
