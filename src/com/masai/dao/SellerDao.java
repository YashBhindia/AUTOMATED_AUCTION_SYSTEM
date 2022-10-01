package com.masai.dao;

import com.masai.model.Product;
import com.masai.model.Seller;

public interface SellerDao {

    public String RegisterSeller(Seller seller);
	
	public String ProductList(Product p);
	
	public String Updateproduct(Product p ,int id);
	
	public String DeleteProduct(Product p, int id);
	
}
