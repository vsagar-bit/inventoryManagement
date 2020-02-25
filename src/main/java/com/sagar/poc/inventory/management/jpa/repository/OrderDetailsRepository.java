package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.OrderDetails;

public interface OrderDetailsRepository extends PagingAndSortingRepository<OrderDetails,Long> {
}
