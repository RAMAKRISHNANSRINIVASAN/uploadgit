package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @GetMapping("/aboutUs")
    public String aboutUs() {
        return "This is the About Us page. Anyone can access.";
    }

    @GetMapping("/contactUs")
    public String contactUs() {
        return "This is the Contact Us page. Anyone can access.";
    }

    @GetMapping("/signIn")
    public String signIn() {
        return "Sign In page accessible to all users.";
    }

    @GetMapping("/signUp")
    public String signUp() {
        return "Sign Up page accessible to all users.";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/addProducts")
    public String addProducts() {
        return "This is Add Products. Only Admins can access.";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/removeProducts")
    public String removeProducts() {
        return "This is Remove Products. Only Admins can access.";
    }
}
