package com.hexa.springannotation2.com.hexa.springannotation2;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
    private String name;  
    private double price; 


    
    public Product() {
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Autowired
    Cart cart;
    
    public Cart getCart() {
		return cart;
	}
	public void setCart(Cart ct) {
		this.cart = ct;
	}

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: $" + price;
    }
}
