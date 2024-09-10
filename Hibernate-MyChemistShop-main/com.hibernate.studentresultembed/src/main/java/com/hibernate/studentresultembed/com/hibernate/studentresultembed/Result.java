package com.hibernate.studentresultembed.com.hibernate.studentresultembed;

import javax.persistence.Embeddable;

@Embeddable
public class Result {
    
    private int marks;
    private String sub;

    public Result() {}

    public Result(int marks, String sub) {
        this.marks = marks;
        this.sub = sub;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "Result [marks=" + marks + ", subject=" + sub + "]";
    }
}
