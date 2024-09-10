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

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
        auth.inMemoryAuthentication() 
                .withUser("abc") 
                .password("abc") 
                .roles("ADMIN") // Admin role
                .and() 
                .withUser("xyz") 
                .password("xyz") 
                .roles("USER"); // User role
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception { 
        http.httpBasic()
            .and()
            .authorizeRequests()
            .antMatchers("/school/addProducts", "/school/removeProducts").hasRole("ADMIN") // Only admin access
            .antMatchers("/school/contactUs", "/school/aboutUs", "/school/signIn", "/school/signUp").permitAll() // Public access
            .and()
            .formLogin();
    } 

    @Bean
    public PasswordEncoder getPasswordEncoder(){ 
        return NoOpPasswordEncoder.getInstance(); 
    } 
}
