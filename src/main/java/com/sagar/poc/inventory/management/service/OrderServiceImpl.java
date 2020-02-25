package com.sagar.poc.inventory.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.poc.inventory.management.jpa.entity.Order;
import com.sagar.poc.inventory.management.jpa.entity.OrderDetails;
import com.sagar.poc.inventory.management.jpa.repository.OrderDetailsRepository;
import com.sagar.poc.inventory.management.jpa.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public Order createOrder(Order order) {
       return orderRepository.save(order);
    }

    @Override
    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

}
