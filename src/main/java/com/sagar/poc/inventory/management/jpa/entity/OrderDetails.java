package com.sagar.poc.inventory.management.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

    @Id
    @Column(name = "ORDERDETAIL_ID")
    private Long orderDetailId;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "PRODUCT_PRICE")
    private Long productPrice;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "DISCOUNT")
    private Integer discount;
    
    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
	private Order order;
    
    public Long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Long getOrderId() {
        return orderDetailId;
    }

    public void setOrderId(Long orderId) {
        this.orderDetailId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderDetailId +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                ", discount=" + discount  +
                '}';
    }

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
