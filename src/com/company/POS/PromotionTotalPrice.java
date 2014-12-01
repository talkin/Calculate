package com.company.POS;

public class PromotionTotalPrice extends Promotion{
    private double thresholdPrice;
    private double reducePrice;

    public PromotionTotalPrice(double thresholdPrice, double reducePrice) {
        this.thresholdPrice = thresholdPrice;
        this.reducePrice = reducePrice;
    }

    @Override
    public double changePrice(Item item) {
        double totalPrice = item.getPrice() * item.getNum();
        if (totalPrice > thresholdPrice) {
            return (totalPrice-reducePrice)/item.getNum();
        } else {
            return item.getPrice();
        }
    }
}
