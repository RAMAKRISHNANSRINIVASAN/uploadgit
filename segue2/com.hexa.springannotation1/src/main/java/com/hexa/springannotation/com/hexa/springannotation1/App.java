package com.hexa.springannotation.com.hexa.springannotation1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext anno= new AnnotationConfigApplicationContext(StudentConfig.class);
    	Student s=(Student)anno.getBean("stud1");
    	Result r=s.getRes();
        System.out.println(s.toString());
        System.out.println(r.toString());
        ((AbstractApplicationContext) anno).close();



         
    }
}
