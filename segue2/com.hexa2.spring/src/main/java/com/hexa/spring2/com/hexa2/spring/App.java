package com.hexa.spring2.com.hexa2.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Product p1=(Product) context.getBean("produ1");

       Cart c1 = p1.getCart();
        
        
        System.out.println(c1.toString());
        System.out.println(p1.toString());

    }
}
