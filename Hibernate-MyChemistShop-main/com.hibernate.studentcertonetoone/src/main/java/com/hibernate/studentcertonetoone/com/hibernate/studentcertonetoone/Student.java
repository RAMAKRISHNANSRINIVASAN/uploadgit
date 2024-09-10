package com.hibernate.studentcertonetoone.com.hibernate.studentcertonetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

    @Id
    private int roll;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Certificate cer;

    public Student() {}

    public Student(int roll, String name, Certificate cer) {
        this.roll = roll;
        this.name = name;
        this.cer = cer;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Certificate getCer() {
        return cer;
    }

    public void setCer(Certificate cer) {
        this.cer = cer;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", certificate=" + cer + "]";
    }
}

