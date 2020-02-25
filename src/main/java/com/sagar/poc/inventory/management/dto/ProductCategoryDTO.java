package com.sagar.poc.inventory.management.dto;

import java.util.List;

public class ProductCategoryDTO {

    private Long productCategoryId;

    private String productCategoryName;

    private String description;
    
    List<ProductDTO> products;

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

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

    
   
}
