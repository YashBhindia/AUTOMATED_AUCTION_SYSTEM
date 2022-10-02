package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exceptions.BuyerException;
import com.masai.exceptions.SellerException;
import com.masai.model.Buyer;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id="YashBhindia";
		String pass="Yash@123";
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter username");
        String newid=sc1.next();
        System.out.println("ENter password");
        String password=sc1.next();
		
		
		
        if((id .equals(newid))&&(pass.equals(password))) {
		Scanner sc = new Scanner(System.in);
		boolean mainFlag = true;
		int mainChoice = 0;
		System.out.println("Welcome to Auto Auction Registration");
		System.out.println("************************************");
		System.out.println("Enter your choice");
		while(mainFlag) {
			System.out.println("1. Insert A  records");
			System.out.println("2. View All the records");
			System.out.println("3  View All Products");
			System.out.println("4. Exit");
			mainChoice = Integer.parseInt(sc.nextLine());
			BuyerDao b1 = new BuyerDaoImpl();
			SellerDao s1 = new SellerDaoImpl();
			switch (mainChoice) {
			case 1:
				boolean insertFlag = true;
				int insertChoice = 0;
				
				while(insertFlag) {
					System.out.println(" enter 1 : Register Buyer");
		        	System.out.println(" enter 2 : Register Seller");
					System.out.println(" enter 3 : Exit");
					
					insertChoice = Integer.parseInt(sc.nextLine());
					
					switch (insertChoice) {
					case 1:
						RegisterBuyer r1 = new RegisterBuyer();
			        	r1.RegisterBuyer();
			        	break;
						
					case 2:
						RegisterSeller r2 = new RegisterSeller();
			        	r2.RegisterSeller();
			        	break;
						
					case 3:
						insertFlag=false;
						break;
					default:
						insertFlag=false;
						break;
					}
					
				}
				break;
				
			
				
				

			case 2:
				boolean flag = true;
				int choice =0;
				
				BuyerDao b2 = new BuyerDaoImpl();
				SellerDao s2 = new SellerDaoImpl();
				while(flag) {
					System.out.println(" Enter 1 : Get all Buyers");
		        	System.out.println(" Enter 2 : Get all Sellers");
					System.out.println(" Enter 3 : Exit");
					choice = Integer.parseInt(sc.nextLine());
					switch (choice) {
					
				case 1:  GetBuyer g1 = new GetBuyer();
					try {
						g1.GetBuyer();
					} catch (BuyerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
				
	        	case 2: GetSeller g2 = new GetSeller();
					try {
						g2.GetSeller();
					} catch (SellerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	break;						
				
	        	case 3:
						
						flag = false;
						
					break;
			
					default:
						flag = false;
						break;
					}
				}
				break;
				
				
				
				
				
			case 3:
				boolean flag1 = true;
				int choice1 =0;
				
				BuyerDao b3 = new BuyerDaoImpl();
				SellerDao s3 = new SellerDaoImpl();
				while(flag1) {
					System.out.println(" Enter 1 : AddProduct");
		        	System.out.println(" Enter 2 : Delete Product");
					System.out.println(" Enter 3 : Exit");
					choice1 = Integer.parseInt(sc.nextLine());
					switch (choice1) {
					
					case 1: AddProduct a1 =  new AddProduct();
		        	a1.AddProduct();
		        	break;
				
	        	case 2: GetSeller g2 = new GetSeller();
					try {
						g2.GetSeller();
					} catch (SellerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	break;						
				
				
	        	case 3:
						
						flag1 = false;
						
					break;
			
					default:
						flag1 = false;
						break;
					}
				}
				break;
				
				
				
				
			
				
			case 4:
				mainFlag=false;
				break;

			default:
				mainFlag = false;
				break;
			}
		}
		
		
        }
        System.out.println("THANK YOU TO VISIT HERE");
        System.out.println("***********************");
	}
	

}
