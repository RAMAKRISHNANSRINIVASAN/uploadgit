package com.hexa.springannotation2.com.hexa.springannotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;	


public class ProductConfig {

	@Bean(name="prod1")
	public Product getProduct()
 
	{
		Product s1= new Product();;
		s1.setName("Arti");
		s1.setPrice(2000.9);
		return s1;
	}

	@Bean(name="cart")
	public  Cart getCart()
	{
		Cart c= new Cart();
		c.setQty(99);
		c.setTotalBill(2000.0);
		return c;


	}
}
