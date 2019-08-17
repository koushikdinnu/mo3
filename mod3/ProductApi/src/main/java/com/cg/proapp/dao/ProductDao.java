package com.cg.proapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.proapp.bean.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	@Query("from Product where category=:category")
	List<Product> getProductByCategory(@Param("category") String category);
	@Query("FROM Product WHERE price BETWEEN :p1 AND :p2")
	List<Product> getProductByPrice(@Param("p1") double min_price,@Param("p2") double max_price);
}
