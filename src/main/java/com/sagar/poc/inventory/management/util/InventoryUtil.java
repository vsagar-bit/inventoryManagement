package com.sagar.poc.inventory.management.util;

import org.springframework.beans.BeanUtils;

import com.sagar.poc.inventory.management.dto.BrandDTO;
import com.sagar.poc.inventory.management.dto.OrderDTO;
import com.sagar.poc.inventory.management.dto.OrderDetailsDTO;
import com.sagar.poc.inventory.management.dto.ProductCategoryDTO;
import com.sagar.poc.inventory.management.dto.ProductDTO;
import com.sagar.poc.inventory.management.dto.SellerDTO;
import com.sagar.poc.inventory.management.jpa.entity.Brand;
import com.sagar.poc.inventory.management.jpa.entity.Order;
import com.sagar.poc.inventory.management.jpa.entity.OrderDetails;
import com.sagar.poc.inventory.management.jpa.entity.Product;
import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;
import com.sagar.poc.inventory.management.jpa.entity.Seller;

//DO SOME DEEP COPY FOR ALL
public class InventoryUtil {

	//DO SOME DEEP COPY
	public static Order getOrder (OrderDTO dto) {
		Order order = new Order();
		BeanUtils.copyProperties(dto, order);
		return order;
	}
	
	//DO SOME DEEP COPY
	public static OrderDTO getOrderDTO(Order order) {
		OrderDTO dto = new OrderDTO();
		BeanUtils.copyProperties(order, dto);
		return dto;
	}
	
	//DO SOME DEEP COPY
	public static Brand getBrand (BrandDTO dto) {
		Brand brand = new Brand ();
		BeanUtils.copyProperties(dto, brand);
		return brand;
	}
	
	//DO SOME DEEP COPY
	public static BrandDTO getBrandDTO (Brand brand) {
		BrandDTO dto = new BrandDTO ();
		BeanUtils.copyProperties(brand, dto);
		return dto;
	}
	
	//DO SOME DEEP COPY
	public static OrderDetails getOrderDetails (OrderDetailsDTO dto) {
		OrderDetails details = new OrderDetails();
		BeanUtils.copyProperties(dto, details);
		return details;
	}
	
	//DO SOME DEEP COPY
	public static OrderDetailsDTO getOrderDetailsDTO (OrderDetails details) {
		OrderDetailsDTO dto = new OrderDetailsDTO();
		BeanUtils.copyProperties(details, dto);
		return dto;
	}
	
	//DO SOME DEEP COPY
	public static Product getProduct (ProductDTO dto) {
		Product prod = new Product ();
		BeanUtils.copyProperties(dto, prod);
		return prod;
	}
	
	//DO SOME DEEP COPY
	public static ProductDTO getProductDTO (Product prod) {
		ProductDTO dto = new ProductDTO ();
		BeanUtils.copyProperties(prod, dto);
		return dto;
	}
	
	//DO SOME DEEP COPY
	public static ProductCategory getProductCategory (ProductCategoryDTO dto) {
		ProductCategory prod = new ProductCategory ();
		BeanUtils.copyProperties(dto, prod);
		return prod;
	}
	
	//DO SOME DEEP COPY
	public static ProductCategoryDTO getProductCategorytDTO (ProductCategory prod) {
		ProductCategoryDTO dto = new ProductCategoryDTO ();
		BeanUtils.copyProperties(prod, dto);
		return dto;
	}
	
	public static Seller getSeller(SellerDTO dto) {
		Seller seller = new Seller();
		BeanUtils.copyProperties(dto, seller);
		return seller;
	}
	
	public static SellerDTO getSellerDTO (Seller seller) {
		SellerDTO dto = new SellerDTO();
		BeanUtils.copyProperties(seller, dto);
		return dto;
	}
	
}
