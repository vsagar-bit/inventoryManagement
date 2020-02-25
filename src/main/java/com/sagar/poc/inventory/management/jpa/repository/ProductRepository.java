package com.sagar.poc.inventory.management.jpa.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sagar.poc.inventory.management.jpa.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
	
	@Query(nativeQuery = true, value = "select * from Product where BRAND_ID = ?1")
	public List<Product> getByBrandId(Long brandId);
	
	@Query(nativeQuery = true, value = "select * from Product where BRAND_ID = ?1 and PRODUCTCATOGORY_ID = ?2")
	public List<Product> getByBrandIdAndType(Long brandId, Long categoryId);
	
	@Query(nativeQuery = true, value = "select * from Product where PRODUCT_NAME = ?1")
	public List<Product> getByName(String name);
	
	@Query(nativeQuery = true, value = "select * from Product where COLOR = ?1")
	public List<Product> getByColor(String color);
	
	@Query(nativeQuery = true, value = "select * from Product where COLOR = ?1 and PRODUCTCATOGORY_ID = ?2")
	public List<Product> getByColorAndType(String color, Long categoryId);
	
	@Query(nativeQuery = true, value = "select * from Product where SALE_PRICE = ?1")
	public List<Product> getByPrice(Long price);
	
	@Query(nativeQuery = true, value = "select * from Product where SALE_PRICE = ?1 and PRODUCTCATOGORY_ID = ?2")
	public List<Product> getByPriceAndType(Long price, Long categoryId);

	@Query(nativeQuery = true, value = "select * from Product where SIZE = ?1")
	public List<Product> getBySize(String size);
	
	@Query(nativeQuery = true, value = "select * from Product where SIZE = ?1 and PRODUCTCATOGORY_ID = ?2")
	public List<Product> getBySizeAndType(String size, Long categoryId);


	@Query(nativeQuery = true, value = "select * from Product where SELLER_ID = ?1")
	public List<Product> getBySellerId(Long sellerId);
	
	@Query(nativeQuery = true, value = "select count(*) from Product where SELLER_ID = ?1")
	public BigInteger getCountBySellerId(Long sellerId);
	
	
	
}
