package com.masai.usecases;

import java.util.List;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exceptions.BuyerException;
import com.masai.model.Buyer;

public class GetBuyer {

public static void GetBuyer() throws BuyerException {
		
		BuyerDao ad = new BuyerDaoImpl();
	
		List<Buyer> ans = ad.getBuyer();
		for(Buyer i:ans) {
			System.out.println("Buyer Id is :"+i.getBuyerId());
			System.out.println("Buyer Name is :"+i.getName());
			System.out.println("Buyer Email is :"+i.getEmail());
			System.out.println("Buyer Password is :"+i.getPassword());
			System.out.println("=====================================");
			
		}
		
		System.out.println(ans);
   }
}
