package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.model.Buyer;

public class RegisterBuyer {

public static void RegisterBuyer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Buyer Name");
		String name = sc.next();
		
		System.out.println("Enter Buyer Email");
		String email = sc.next();
		
		System.out.println("Enter Buyer Password");
		String password = sc.next();
		
		BuyerDao bdao = new BuyerDaoImpl();
		
		Buyer c = new Buyer(id, name, email, password);
		

		
		String result = bdao.RegisterBuyer(c);
		System.out.println(result);
		
	}
}
