package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import com.sagar.poc.inventory.management.jpa.entity.Brand;

public interface BrandService {

	public Brand createBrand(Brand brand);
	public Optional<Brand> getBrand(Long id);
	public List<Brand> listOfBrand();
	public Brand getBrandByName(String name);
	public void deleteById(Long id);
	
}

