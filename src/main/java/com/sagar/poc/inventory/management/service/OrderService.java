package com.sagar.poc.inventory.management.service;

import com.sagar.poc.inventory.management.jpa.entity.Order;
import com.sagar.poc.inventory.management.jpa.entity.OrderDetails;

public interface OrderService {

    public Order createOrder(Order order);
    public OrderDetails createOrderDetails(OrderDetails orderDetails);
}
