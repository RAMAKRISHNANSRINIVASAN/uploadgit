package com.hexa.springannotation2.com.hexa.springannotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext anno=new AnnotationConfigApplicationContext(ProductConfig.class);
    	Product s=(Product)anno.getBean("prod1");
    	Cart r=s.getCart();
        System.out.println(s.toString());
        System.out.println(r.toString());
        anno.close();

    }
}
