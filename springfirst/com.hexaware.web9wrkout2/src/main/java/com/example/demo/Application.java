package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entities.User;
import com.example.demo.UserRepo.UserRepsitory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepsitory rep =context.getBean(UserRepsitory.class);
//		Iterable<User> users=rep.findAll();
//		users.forEach((temp)->System.out.println(temp.toString()));
		
		User user1= new User();
		user1.setUserId(200);
		user1.setName("ajay");
		user1.setFee(7000.9);
		rep.save(user1);
		
//Optional<User>u= rep.findById(200);
//		
//		System.out.println(u);
//		if(u.isPresent())
//		{
//			rep.deleteById(200);
// 
//			
//		}
//		else
//		{
//			System.out.println("Not Found");
//		}
		
		
//		rep.deleteById(100);
//		
//			System.out.println("Removed");
//		
		
		
		Optional<User> u=	rep.findById(100);
		
		 if(u.isPresent())
		 {
			
			    User temp=u.get();
			    
			   temp.setName("jatin");
			   rep.save(temp);
			
		 }
		 else
		 {
			 System.out.println("Not Found");
		 }
		
		
		
	}


}
