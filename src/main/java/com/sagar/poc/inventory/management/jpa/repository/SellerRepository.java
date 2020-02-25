package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.Seller;

public interface SellerRepository extends PagingAndSortingRepository<Seller, Long> {

}
