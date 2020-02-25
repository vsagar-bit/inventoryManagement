package com.sagar.poc.inventory.management.jpa.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Order {

	@Id
	@Column(name = "ORDER_ID")
	private Long orderId;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "ORDER_AMOUNT")
	private Long orderAmount;
	@Column(name = "DISCOUNT")
	private Long discount;
	@Column(name = "TAX_AMOUNT")
	private Long taxAmount;
	@Column(name = "NET_AMOUNT")
	private Long netAmount;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "order")
	private List<OrderDetails> orderItems;
	
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
	public List<OrderDetails> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderDetails> orderItems) {
		this.orderItems = orderItems;
	}
	
}
