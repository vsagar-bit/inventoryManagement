package com.sagar.poc.inventory.management.dto;

public class ProductDTO {
	
	private Long productId;
	private String productName;
	private String color;
	private String size;
	private Long purchasePrice;
	private Long salePrice;
	private BrandDTO brand;
	private ProductCategoryDTO productCatogory;
    private SellerDTO seller;
	private Long quantity;
	private String description;
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
	public BrandDTO getBrand() {
		return brand;
	}
	public void setBrand(BrandDTO brand) {
		this.brand = brand;
	}
	public ProductCategoryDTO getProductCatogory() {
		return productCatogory;
	}
	public void setProductCatogory(ProductCategoryDTO productCatogory) {
		this.productCatogory = productCatogory;
	}
	public SellerDTO getSeller() {
		return seller;
	}
	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
	
	
}
