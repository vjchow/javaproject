package com.walmart.constructor;

public class ShoppingCart {

	private int addItem;
	private int removeItem;
	private int quantityOfItem; 
	private String nameOfItem;
	private double price;
	
	public ShoppingCart() {
		System.out.println("This is an empty cart");
	}
	
	public ShoppingCart(int addItem, int removeItem, int quantityOfItem, String nameOfItem, double price) {
		this.addItem = addItem;
		this.removeItem = removeItem; 
		this.quantityOfItem = quantityOfItem; 
		this.nameOfItem = nameOfItem;
		this.price = price;
	}
	
	
	
	public void shoppingCart(int updateShoppingCart) {
		this.quantityOfItem = addItem + removeItem;
		updateShoppingCart = quantityOfItem + addItem; 
		
		System.out.println("The quantity of items is " + this.quantityOfItem + updateShoppingCart);
	}
	
	
	public void setAddItem(int addItem) {
		this.addItem = addItem; 
	}
	
	public int getAddItem() {
		return addItem; 
	}
	
	public void setRemoveItem(int removeItem) {
		this.removeItem = removeItem;
	}
	
	public int getRemoveItem() {
		return removeItem;
	}
	
	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}
	
	public int getQuantityOfItem() {
		return quantityOfItem;
	}
	
	public void setNameOfItem(String nameOfItem) {
		this.nameOfItem = nameOfItem; 
	}
	
	public String getNameOfItem() {
		return nameOfItem; 
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price; 
	}
}
