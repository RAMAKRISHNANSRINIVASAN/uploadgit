package com.hexaware.app;



import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SchoolSecurityConfig extends WebSecurityConfigurerAdapter {

    // Configure in-memory authentication for Admin and User roles
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("admin") // Admin user
            .password("admin123")
            .roles("ADMIN") // Admin role
            .and()
            .withUser("user") // Normal user
            .password("user123")
            .roles("USER"); // User role
    }

    // Configure role-based access control
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .httpBasic()
            .and()
            .authorizeRequests()
            // Public access (aboutUs, contactUs, signIn, signUp)
            .antMatchers("/aboutUs", "/contactUs", "/signIn", "/signUp").permitAll()

            // Restricted access to Admins for adding/removing products
            .antMatchers("/addProducts", "/removeProducts").hasRole("ADMIN")

            // Any other request needs to be authenticated
            .anyRequest().authenticated()
            .and()
            .formLogin();
   
    }

    // NoOpPasswordEncoder for development purposes
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}

