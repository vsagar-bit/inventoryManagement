package com.sagar.poc.inventory.management.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "SIZE")
	private String size;
	@Column(name = "PURCHASE_PRICE")
	private Long purchasePrice;
	@Column(name = "SALE_PRICE")
	private Long salePrice;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "BRAND_ID")
	private Brand brand;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "PRODUCTCATOGORY_ID")
	private ProductCategory productCatogory;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "SELLER_ID")
    private Seller seller;
	
	@Column(name = "QUANTITY")
	private Long quantity;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "IMAGE_PATH")
	private String imagePath;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getName() {
		return productName;
	}
	public void setName(String name) {
		this.productName = name;
	}
	public Long getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Long getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public ProductCategory getProductCatogory() {
		return productCatogory;
	}
	public void setProductCatogory(ProductCategory productCatogory) {
		this.productCatogory = productCatogory;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
	
}
