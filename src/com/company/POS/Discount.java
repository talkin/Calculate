package com.company.POS;

public class Discount extends Promotion {
    private double discount;

    public Discount(double discount) {
        this.discount = discount;
    }

    @Override
    public double changePrice(double price, int num) {
        return price * discount;
    }
}
