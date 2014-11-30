package com.company.POS;

public class PromotionPriceOver extends Promotion{
    private double thresholdPrice;

    public PromotionPriceOver(double thresholdPrice) {
        this.thresholdPrice = thresholdPrice;
    }

    @Override
    public double changePrice(Item item) {
        double totalPrice = item.getPrice() * item.getNum();
        if (totalPrice > thresholdPrice) {
            return (totalPrice-20)/item.getNum();
        } else {
            return item.getPrice();
        }
    }
}
