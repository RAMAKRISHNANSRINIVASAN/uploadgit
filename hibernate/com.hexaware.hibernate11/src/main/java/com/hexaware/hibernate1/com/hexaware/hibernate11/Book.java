package com.hexaware.hibernate1.com.hexaware.hibernate11;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITBook")
public class Book {
   @Id
   @Column(name = "Bno")
   private int Bno;

   @Column(name = "Name")
   private String Name;

   @Column(name = "Price")
   private Double price;

   // Getter and Setter for Bno
   public int getBno() {
       return Bno;
   }

   public void setBno(int bno) {
       this.Bno = bno;
   }

   // Getter and Setter for Name
   public String getName() {
       return Name;
   }

   public void setName(String name) {
       this.Name = name;
   }

   // Getter and Setter for Price
   public Double getPrice() {
       return price;
   }

   public void setPrice(Double price) {
       this.price = price;
   }

   // Override toString method to display Book details
   @Override
   public String toString() {
       return "Book [Bno=" + Bno + ", Name=" + Name + ", Price=" + price + "]";
   }
}
