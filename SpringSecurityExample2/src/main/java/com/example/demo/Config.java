package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {
	// Adding the roles 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
        auth.inMemoryAuthentication() 
                .withUser("abc") 
                .password("abc") 
                .roles("admin_role") 
                .and() 
                .withUser("xyz") 
                .password("xyz") 
                .roles("student_role");
    } 
    
    // Configuring the api  
    // according to the roles. 
  @Override
  protected void configure(HttpSecurity http) throws Exception { 
      http. 
              httpBasic() 
              .and() 
              .authorizeRequests()
              .antMatchers("/delete","/mcq").hasRole("admin_role")
              .antMatchers("/greeting").hasRole("student_role") // Add this line for student access

              .and()
              .formLogin();
      
  } 
  
    // Function to encode the password 
    // assign to the particular roles. 
  @Bean
  public PasswordEncoder getPasswordEncoder(){ 
      return NoOpPasswordEncoder.getInstance(); 
  } 
}
