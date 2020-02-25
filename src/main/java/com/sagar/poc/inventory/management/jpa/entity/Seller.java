package com.sagar.poc.inventory.management.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Seller")
public class Seller {

	@Id
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "SELLER_NAME")
    private String sellerName;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "IS_ACTIVE")
    private String isActive;
    
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "seller")
    List<Product> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
    
}
