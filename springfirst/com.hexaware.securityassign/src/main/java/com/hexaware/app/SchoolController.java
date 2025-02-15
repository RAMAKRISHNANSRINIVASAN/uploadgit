package com.hexaware.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    // Public access - Everyone can access these
    @GetMapping("/aboutUs")
    public String aboutUs() {
        return "Welcome to the About Us page!";
    }

    @GetMapping("/contactUs")
    public String contactUs() {
        return "Contact us at: contact@school.com";
    }

    @GetMapping("/signIn")
    public String signIn() {
        return "Please sign in to access your account.";
    }

    @GetMapping("/signUp")
    public String signUp() {
        return "Create an account to get started!";
    }

    // Admin-only access for product management
    @GetMapping("/addProducts")
    public String addProducts() {
        return "Product has been added successfully! (Admin access only)";
    }

    @GetMapping("/removeProducts")
    public String removeProducts() {
        return "Product has been removed successfully! (Admin access only)";
    }
  

}
