package com.sagar.poc.inventory.management.util;

import org.springframework.beans.BeanUtils;

import com.sagar.poc.inventory.management.dto.BrandDTO;
import com.sagar.poc.inventory.management.dto.OrderDTO;
import com.sagar.poc.inventory.management.dto.OrderDetailsDTO;
import com.sagar.poc.inventory.management.dto.ProductCategoryDTO;
import com.sagar.poc.inventory.management.dto.ProductDTO;
import com.sagar.poc.inventory.management.jpa.entity.Brand;
import com.sagar.poc.inventory.management.jpa.entity.Order;
import com.sagar.poc.inventory.management.jpa.entity.OrderDetails;
import com.sagar.poc.inventory.management.jpa.entity.Product;
import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;

//DO SOME DEEP COPY FOR ALL
public class InventoryUtil {

	public static Order getOrder (OrderDTO dto) {
		Order order = new Order();
		BeanUtils.copyProperties(dto, order);
		return order;
	}
	
	public static OrderDTO getOrderDTO(Order order) {
		OrderDTO dto = new OrderDTO();
		BeanUtils.copyProperties(order, dto);
		return dto;
	}
	
	public static Brand getBrand (BrandDTO dto) {
		Brand brand = new Brand ();
		BeanUtils.copyProperties(dto, brand);
		return brand;
	}
	
	public static BrandDTO getBrandDTO (Brand brand) {
		BrandDTO dto = new BrandDTO ();
		BeanUtils.copyProperties(brand, dto);
		return dto;
	}
	
	public static OrderDetails getOrderDetails (OrderDetailsDTO dto) {
		OrderDetails details = new OrderDetails();
		BeanUtils.copyProperties(dto, details);
		return details;
	}
	
	public static OrderDetailsDTO getOrderDetailsDTO (OrderDetails details) {
		OrderDetailsDTO dto = new OrderDetailsDTO();
		BeanUtils.copyProperties(details, dto);
		return dto;
	}
	
	public static Product getProduct (ProductDTO dto) {
		Product prod = new Product ();
		BeanUtils.copyProperties(dto, prod);
		return prod;
	}
	
	public static ProductDTO getProductDTO (Product prod) {
		ProductDTO dto = new ProductDTO ();
		BeanUtils.copyProperties(prod, dto);
		return dto;
	}
	
	public static ProductCategory getProductCategory (ProductCategoryDTO dto) {
		ProductCategory prod = new ProductCategory ();
		BeanUtils.copyProperties(dto, prod);
		return prod;
	}
	
	public static ProductCategoryDTO getProductCategorytDTO (ProductCategory prod) {
		ProductCategoryDTO dto = new ProductCategoryDTO ();
		BeanUtils.copyProperties(prod, dto);
		return dto;
	}
	
}
