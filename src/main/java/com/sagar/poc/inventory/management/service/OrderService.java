package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

import com.sagar.poc.inventory.management.jpa.entity.Order;
import com.sagar.poc.inventory.management.jpa.entity.OrderDetails;

public interface OrderService {

    public Order createOrder(Order order);
    public Optional<Order> getOrderById (Long id);
    public List<Order> getAllOrders();
    
    public OrderDetails createOrderDetails(OrderDetails orderDetails);
    public Optional<OrderDetails> getOrderDetailById (Long id);
    public List<OrderDetails> getAllOrderDetails();
    
}
