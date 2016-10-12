package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkart.model.Product;

public interface ProductDAO {
	
	public boolean saveOrUpdate(Product product);
	public boolean delete(Product product);
	public Product get(int id);
	public List<Product> list();
	public List<Product>getproduct(int id);
	public List<Product> navproduct(int id);

}
