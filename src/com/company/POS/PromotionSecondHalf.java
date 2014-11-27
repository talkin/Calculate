package com.company.POS;

public class PromotionSecondHalf extends Promotion{

    @Override
    public double changePrice(Item item) {
        double totalPrice;
        if (item.getNum()%2 == 1) {
            totalPrice = item.getPrice() * (item.getNum()-1) / 2 * (1 + 0.5) + item.getPrice();
        } else {
            totalPrice = item.getPrice() * item.getNum() /2 *(1 + 0.5);
        }
        return totalPrice/item.getNum();
    }

}
