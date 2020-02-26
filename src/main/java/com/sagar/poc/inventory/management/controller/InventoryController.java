package com.sagar.poc.inventory.management.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.poc.inventory.management.dto.BrandDTO;
import com.sagar.poc.inventory.management.dto.ProductDTO;
import com.sagar.poc.inventory.management.dto.SellerDTO;
import com.sagar.poc.inventory.management.jpa.entity.Brand;
import com.sagar.poc.inventory.management.jpa.entity.Product;
import com.sagar.poc.inventory.management.jpa.entity.ProductCategory;
import com.sagar.poc.inventory.management.jpa.entity.Seller;
import com.sagar.poc.inventory.management.service.BrandService;
import com.sagar.poc.inventory.management.service.OrderService;
import com.sagar.poc.inventory.management.service.ProductCategoryService;
import com.sagar.poc.inventory.management.service.ProductService;
import com.sagar.poc.inventory.management.service.SellerService;
import com.sagar.poc.inventory.management.util.InventoryUtil;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	BrandService brandService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	ProductCategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	SellerService sellerService;
	
	@GetMapping("/product/byBrand/{brand}/{category}")
	public List<ProductDTO> getByBrand (@PathParam("brand") String brand, @PathParam("category") String category) {
		
		Brand brnd = brandService.getBrandByName(brand);
		ProductCategory cat = categoryService.getByName(category);
		
		return productService.getByBrandIdAndType(brnd.getId(), cat.getProductCategoryId()).stream().map(e -> InventoryUtil.getProductDTO(e)).collect(Collectors.toList());
		
	}
	
	@GetMapping("/product/byColor/{color}/{category}")
	public List<ProductDTO> getByColor (@PathParam("color") String color, @PathParam("category") String category) {
		
		ProductCategory cat = categoryService.getByName(category);
		
		return productService.getByColorAndType(color, cat.getProductCategoryId()).stream().map(e -> InventoryUtil.getProductDTO(e)).collect(Collectors.toList());
		
	}
	
	@GetMapping("/product/byColor/{price}/{category}")
	public List<ProductDTO> getByPrice (@PathParam("price") String price, @PathParam("category") String category) {
		
		ProductCategory cat = categoryService.getByName(category);
		
		return productService.getByPriceAndType(Long.parseLong(price), cat.getProductCategoryId()).stream().map(e -> InventoryUtil.getProductDTO(e)).collect(Collectors.toList());
		
	}
	
	@GetMapping("/product/byColor/{size}/{category}")
	public List<ProductDTO> getBySize (@PathParam("size") String size, @PathParam("category") String category) {
		
		ProductCategory cat = categoryService.getByName(category);
		
		return productService.getBySizeAndType(size, cat.getProductCategoryId()).stream().map(e -> InventoryUtil.getProductDTO(e)).collect(Collectors.toList());
		
	}
	
	@GetMapping("/product/bySKU/{id}")
	public ProductDTO getBySKU (@PathParam("id") String id) {
		Optional<Product> prod = productService.getProduct(Long.parseLong(id));
		if(productService.getProduct(Long.parseLong(id)).isPresent()) {
			return InventoryUtil.getProductDTO(prod.get());
		}
		else return null;
		
	}
	
	@GetMapping("/product/countBy")
	public BigInteger getProductCountBySeller(@RequestParam("sellerId") String sellerId) {
		return productService.getCountBySellerId(Long.parseLong(sellerId));
	}
	
	@PostMapping("/seller/save") 
	public Boolean saveSeller(SellerDTO seller) {
		Seller entity = sellerService.createSeller(InventoryUtil.getSeller(seller));
		// can cascade products save
		seller.getProducts().stream().map(e -> InventoryUtil.getProduct(e)).forEach(e -> {
			e.setSeller(entity);
			productService.createProduct(e);
		});
		return true;
	}
	
	@PostMapping("/brand/save") 
	public Boolean saveBrand(BrandDTO brand) {
		Brand entity = brandService.createBrand(InventoryUtil.getBrand(brand));
		// can cascade products save
		brand.getProducts().stream().map(e -> InventoryUtil.getProduct(e)).forEach(e -> {
			e.setBrand(entity);
			productService.createProduct(e);
		});
		return true;
	}
	
	@DeleteMapping("seller/{id}")
	public Boolean deleteSeller(@PathParam("id") String id) {
		sellerService.deleteSellerById(Long.parseLong(id));
		return true;
	}
	
	@DeleteMapping("brand/{id}")
	public Boolean deleteBrand(@PathParam("id") String id) {
		brandService.deleteById(Long.parseLong(id));
		return true;
	}
	
}
