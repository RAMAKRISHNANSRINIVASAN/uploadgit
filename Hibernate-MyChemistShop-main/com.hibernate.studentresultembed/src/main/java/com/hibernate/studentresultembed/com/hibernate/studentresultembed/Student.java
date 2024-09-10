package com.hibernate.studentresultembed.com.hibernate.studentresultembed;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
    
    @Id
    private int roll;
    private String name;
    
    @Embedded
    private Result result;

    public Student() {}

    public Student(int roll, String name, Result result) {
        this.roll = roll;
        this.name = name;
        this.result = result;
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

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", result=" + result + "]";
    }
}
