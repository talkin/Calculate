package com.company.POS;

public class PromotionDiscount extends Promotion {
    private double discount;

    public PromotionDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double changePrice(Product product) {
        return product.getNewPrice() * discount;
    }
}
