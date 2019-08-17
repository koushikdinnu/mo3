package com.cg.proapp.service;

import java.util.List;


import com.cg.proapp.bean.Product;



public interface ProductService {
	List<Product> getAllProducts();
	Product getProductById(int id);
	void updateProduct(Product pro);
	void addProduct(Product pro);
	void deleteProduct(int id);
	List<Product> getProductByCategory(String category);
	List<Product> getProductByPrice(double minPrice, double maxPrice);
	boolean validateCategoryAndQuantity(String myCategory, int myQuantity);
}
