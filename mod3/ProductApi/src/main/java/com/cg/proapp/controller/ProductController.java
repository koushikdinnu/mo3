package com.cg.proapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.cg.proapp.bean.Product;
import com.cg.proapp.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping("/api/products")
public List<Product> getProducts(){
	return productService.getAllProducts();
}
	@RequestMapping("/api/products/{id}")
	public Product getProducts(@PathVariable int id){
		return productService.getProductById(id);
	}
	@RequestMapping(value="/api/products/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteProduct(@PathVariable int id){
		productService.deleteProduct(id);
		return new ResponseEntity<String>("Product with id "+id+"deleted",HttpStatus.OK);
	}
	//@PostMapping("/api/employees/")
	@RequestMapping(value="api/products",method=RequestMethod.POST)
	public ResponseEntity<String> addProduct(@RequestBody Product pro) {
		String myCategory = pro.getCategory();
		int myQuantity = pro.getQuantity();
		boolean check = productService.validateCategoryAndQuantity(myCategory,myQuantity);
		if(check==false) {
			return new ResponseEntity<String>("Product category should be mobile tv and laptop and quantity should not be zero ",HttpStatus.OK);
		}
		else
		{
		productService.addProduct(pro);
		return new ResponseEntity<String>("Product is added successfully",HttpStatus.OK);
	}}
	@RequestMapping(value="api/products/{id}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateProduct(@RequestBody Product pro) {
		productService.updateProduct(pro);
		return new ResponseEntity<String>("Product is updated successfully",HttpStatus.OK);
	}
	@RequestMapping("/api/products/category")
	public List<Product> getProductByCategory(@RequestParam String category){
		return productService.getProductByCategory(category);
	}
	@RequestMapping(value="api/products/{minPrice}/{maxPrice}",method=RequestMethod.GET)
	public List<Product> getProductByprice(@PathVariable double minPrice,@PathVariable double maxPrice){
		return productService.getProductByPrice(minPrice,maxPrice);
	}
}
