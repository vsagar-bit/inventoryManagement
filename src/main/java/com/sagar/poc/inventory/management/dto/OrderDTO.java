package com.sagar.poc.inventory.management.dto;

import java.sql.Date;
import java.util.List;

public class OrderDTO {

	private Long orderId;
	private Date orderDate;
	private Long orderAmount;
	private Long discount;
	private Long taxAmount;
	private Long netAmount;
	
	private List<OrderDetailsDTO> orderItems;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public Long getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Long getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(Long netAmount) {
		this.netAmount = netAmount;
	}
	public List<OrderDetailsDTO> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderDetailsDTO> orderItems) {
		this.orderItems = orderItems;
	}
	
}
