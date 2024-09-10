package com.hexa.springannotation.com.hexa.springannotation1;

public class Result {
    private int marks;
    private String remarks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Result [marks=" + marks + ", remarks=" + remarks + "]";
    }
}
