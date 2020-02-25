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
@Table(name = "Brand")
public class Brand {

    @Id
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "BRAND_NAME")
    private String brandName;

    @Column(name = "LOGO")
    private String logo;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "brand")
    List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
