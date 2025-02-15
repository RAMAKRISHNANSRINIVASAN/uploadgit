package com.hexaware.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
    @Id
    int Roll;

    @NotEmpty(message = "Name cannot be empty")
    String name;

    @Min(value = 18, message = "Age cannot be less than 18")
    @Max(value = 60, message = "Age cannot be greater than 60")
    int age;

    Double fee;

    @Email(message = "Email should be valid")
    String email;

    @Size(min = 4, max = 50, message = "Address must be between 4 and 50 characters")
    String address;

   
    public Student() {
    }

  
    public Student(int roll, String name, int age, Double fee, String email, String address) {
        super();
        this.Roll = roll;
        this.name = name;
        this.age = age;
        this.fee = fee;
        this.email = email;
        this.address = address;
    }

  
    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        this.Roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [Roll=" + Roll + ", Name=" + name + ", Age=" + age + ", Fee=" + fee +
               ", Email=" + email + ", Address=" + address + "]";
    }
}
