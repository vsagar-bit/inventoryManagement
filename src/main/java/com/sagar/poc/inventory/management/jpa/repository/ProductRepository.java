package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
