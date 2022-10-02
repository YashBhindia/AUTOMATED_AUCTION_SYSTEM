package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.model.Product;

public class AddProduct {

	public static void AddProduct() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Id");
		int id = sc.nextInt();

		System.out.println("Enter Product Name");
		String name = sc.next();

		System.out.println("Enter Product Price");
		int price = sc.nextInt();

		System.out.println("Enter Product Quantity");
		int quantity = sc.nextInt();

		System.out.println("Enter Product Category");
		String category = sc.next();

		System.out.println("Enter Seller Id");
		int S_id = sc.nextInt();

		SellerDao s = new SellerDaoImpl();

		Product p = new Product(id, name, price, quantity, category, id);


		String result = s.ProductList(p);
		System.out.println(result);

	}

}
