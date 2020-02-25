package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sagar.poc.inventory.management.jpa.entity.Brand;
import com.sagar.poc.inventory.management.jpa.repository.BrandRepository;

public class BrandServiceImpl implements BrandService{

	@Autowired
	BrandRepository brandRepo;
	
	@Override
	public Brand createBrand(Brand brand) {
		return brandRepo.save(brand);
	}

	@Override
	public Optional<Brand> getBrand(Long id) {
		
		return brandRepo.findById(id);
	}
	
	@Override
	public List<Brand> getBrandByName(String name) {
		
		return brandRepo.getBrandByName(name);
	}

	@Override
	public List<Brand> listOfBrand() {
		
		return (List<Brand>) brandRepo.findAll();
	}
	
}
