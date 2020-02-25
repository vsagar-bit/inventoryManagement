package com.sagar.poc.inventory.management.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<Order> getOrderById(Long id) {
		
		return orderRepository.findById(id);
	}

	@Override
	public List<Order> getAllOrders() {
		
		return (List<Order>) orderRepository.findAll();
	}

	@Override
	public Optional<OrderDetails> getOrderDetailById(Long id) {
		
		return orderDetailsRepository.findById(id);
	}

	@Override
	public List<OrderDetails> getAllOrderDetails() {
		
		return (List<OrderDetails>) orderDetailsRepository.findAll();
	}

}
