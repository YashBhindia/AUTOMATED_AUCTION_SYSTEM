package com.masai.model;

public class Product {

	private Integer productId;
	private String productName;
	private Integer productPrice;
	private Integer quantity;

	public Product() {
		super();
	}

	public Product(Integer productId, String productName, Integer productPrice, Integer quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
