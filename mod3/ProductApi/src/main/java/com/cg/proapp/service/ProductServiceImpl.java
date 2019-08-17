package com.cg.proapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.proapp.bean.Product;
import com.cg.proapp.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.findById(id).get();
	}

	@Override
	public void updateProduct(Product pro) {
		// TODO Auto-generated method stub
		productDao.save(pro);
	}

	@Override
	public void addProduct(Product pro) {
		
		
		// TODO Auto-generated method stub
		productDao.save(pro);
	}

	public boolean validateCategoryAndQuantity(String myCategory, int myQuantity) {
		if((myCategory.equals("mobile") || myCategory.equals("tv") || myCategory.equals("laptop")) && myQuantity>0 )
		return true;
		else
			return false;
	}
	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productDao.deleteById(id);
	}



	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategory(category);
	}
	@Override
	public List<Product> getProductByPrice(double minPrice, double maxPrice) {
		// TODO Auto-generated method stub
		return productDao.getProductByPrice(minPrice, maxPrice);
	}


	
	
}
