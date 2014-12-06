package com.company.POS;

/**
 * Created by jtao on 12/5/14.
 */
public class OffWhenFull extends Promotion {
    private double criticalPrice;
    private int reduction;

    public OffWhenFull(double criticalPrice, int reduction) {
        this.criticalPrice = criticalPrice;
        this.reduction = reduction;
    }

    @Override
    public double changePrice(double price, int num) {
        double totalPrice = price * num;
        if (totalPrice > criticalPrice) {
            totalPrice -= reduction;
        }
        return totalPrice/num;
    }
}
