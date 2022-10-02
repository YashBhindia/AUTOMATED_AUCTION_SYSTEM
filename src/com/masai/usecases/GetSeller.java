package com.masai.usecases;

import java.util.List;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exceptions.SellerException;
import com.masai.model.Buyer;
import com.masai.model.Seller;

public class GetSeller {

	public static void GetSeller() throws SellerException {
		// TODO Auto-generated method stub

		SellerDao ad = new SellerDaoImpl();
		
		List<Seller> ans = ad.getSeller();
		for(Seller i:ans) {
			System.out.println("Seller Id is :"+i.getSellerId());
			System.out.println("Seller Name is :"+i.getName());
			System.out.println("Seller Email is :"+i.getEmail());
			System.out.println("Seller Password is :"+i.getPassword());
			System.out.println("=====================================");
			
		}
		
		System.out.println(ans);
	}
}
