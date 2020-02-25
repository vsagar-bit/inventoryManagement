package com.sagar.poc.inventory.management.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCategory")
public class ProductCategory {

    @Id
    @Column(name = "PRODUCTCATOGORY_ID")
    private Long productCategoryId;

    @Column(name = "PRODUCTCATOGORY_NAME")
    private String productCategoryName;

    @Column(name = "DESCRPTION")
    private String description;
    
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "productCatogory")
    List<Product> products;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getName() {
		return productCategoryName;
	}

	public void setName(String name) {
		this.productCategoryName = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

    
   
}
