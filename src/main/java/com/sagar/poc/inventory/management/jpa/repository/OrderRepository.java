package com.sagar.poc.inventory.management.jpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.Order;

public interface OrderRepository extends PagingAndSortingRepository<Order,Long> {
}
