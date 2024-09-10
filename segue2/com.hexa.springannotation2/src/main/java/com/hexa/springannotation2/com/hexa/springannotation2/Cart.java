package com.hexa.springannotation2.com.hexa.springannotation2;





public class Cart {
    private int qty;
    private double totalBill;

    public Cart() {
    }


    public Cart(int qty, double totalBill) {
        this.qty = qty;
        this.totalBill = totalBill;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "Quantity: " + qty + ", Total Bill: $" + totalBill;
    }
}

