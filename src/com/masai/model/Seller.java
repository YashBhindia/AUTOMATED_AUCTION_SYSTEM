package com.masai.model;

import java.util.List;

public class Seller {

	private Integer sellerId;
	private String firstName;
	private String lastName;
	private Address address;

	private List<Product> products;

	private List<Product> itemsSold;

	public Seller() {
		super();
	}

	public Seller(Integer sellerId, String firstName, String lastName, Address address, List<Product> products,
			List<Product> itemsSold) {
		super();
		this.sellerId = sellerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.products = products;
		this.itemsSold = itemsSold;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getItemsSold() {
		return itemsSold;
	}

	public void setItemsSold(List<Product> itemsSold) {
		this.itemsSold = itemsSold;
	}

}
