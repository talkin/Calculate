package com.company.POS;

public class PromotionDiscount extends Promotion {
    private double discount;

    public PromotionDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double changePrice(Item item) {
        return item.getPrice() * discount;
    }
}
