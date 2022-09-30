package com.masai.dao;

import java.util.List;

import com.masai.model.Buyer;
import com.masai.model.Product;

public interface BuyerDao {

	public Buyer registerBuyer(Buyer buyer);
	
	public List<Buyer> viewAllBuyers();
	
	public Product buyProduct(int productId);
	
	
}
