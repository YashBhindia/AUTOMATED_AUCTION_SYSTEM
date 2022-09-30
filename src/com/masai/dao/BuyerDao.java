package com.masai.dao;

import java.util.List;

import com.masai.model.Buyer;
import com.masai.model.Product;

public interface BuyerDao {

	public Buyer registerBuyer(Buyer buyer) throws BuyerException;
	
	public List<Buyer> viewAllBuyers() throws BuyerExcetion;
	
	public Product buyProduct(int productId) throws BuyerException; 
	
	
}
