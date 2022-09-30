package com.masai.dao;

import java.util.List;

import com.masai.model.Product;
import com.masai.model.Seller;

public interface SellerDao {

	public Seller registerSeller(Seller seller) throws SellerException;
	
	public List<Product> createListOfitems(List<Product> products) throws SellerException;
	
	public Product updateProduct(Product product) throws Sellerexception;
	
	public Product addProductInList(Product product) throws SellerException;
	
	public Product removeProductInList(Product product) throws SellerException;
	
	public List<Product> soldItems(int sellerId) throws SellerException;
	
}
