package com.sagar.poc.inventory.management.dto;

public class OrderDetailsDTO {

    private Long orderDetailId;
    private Long productId;
    private Long productPrice;
    private Integer quantity;
    private Integer discount;
    
	private OrderDTO order;
    
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

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}
}
