package com.hexa.spring2.com.hexa2.spring;

public class Product {
    private String name;  
    private double price; 


    
    public Product() {
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    Cart ct;
    
    public Cart getCart() {
		return ct;
	}
	public void setCart(Cart ct) {
		this.ct = ct;
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