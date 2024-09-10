package com.hexa.spring1.com.hexa1.spring;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
/**
* Hello world!
*
*/
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//     	Book b1=(Book) context.getBean("book1");
//    	Book b2=(Book) context.getBean("book2");
//     	System.out.println(b1.toString());
//     	System.out.println(b2.toString());
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Student s1=(Student) context.getBean("stud1");

       Result res=s1.getRes();
    	
    	System.out.println( s1.toString() );
    	System.out.println( res.toString() );
    }
}
