package com.capgemini.core.pms.dao;

import java.util.List;

import com.capgemini.core.pms.dto.Product;
import com.capgemini.core.pms.exception.ProductManagementSystemException;

public interface IProductDAO 
{
	   public int addProduct(Product product) throws ProductManagementSystemException;
	   
	   public Product getProduct(int id) throws ProductManagementSystemException;
	   
	   public void updateProduct(Product product) throws ProductManagementSystemException;
	   
	   public Product removeProduct(int id)  throws ProductManagementSystemException;
	   
	   public List<Product> getProducts()  throws ProductManagementSystemException;
	   
	   
}
