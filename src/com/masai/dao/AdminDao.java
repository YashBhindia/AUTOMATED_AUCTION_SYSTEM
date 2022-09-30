package com.masai.dao;

import java.util.List;

import com.masai.model.Buyer;
import com.masai.model.Product;
import com.masai.model.Seller;

public interface AdminDao {

	public List<Buyer> viewBuyerList() throws BuyerException;
	
	public List<Seller> viewSellerList() throws SellerException;
	
	public List<Product> dailySellingReport() throws SellerException;
	
	
}
