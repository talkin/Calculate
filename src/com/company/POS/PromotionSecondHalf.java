package com.company.POS;

public class PromotionSecondHalf extends Promotion{

    @Override
    public double changePrice(Product product) {
        double totalPrice;
        if (product.getNum()%2 == 1) {
            totalPrice = product.getNewPrice() * (product.getNum()-1) / 2 * (1 + 0.5) + product.getNewPrice();
        } else {
            totalPrice = product.getNewPrice() * product.getNum() /2 *(1 + 0.5);
        }
        return totalPrice/product.getNum();
    }

}
