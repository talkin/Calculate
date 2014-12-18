package com.company.POS;

public class SecondHalf extends Promotion{
    @Override
    public double changePrice(double price, int num) {
        double totalPrice = 0;
        if (num%2 == 1) {
            totalPrice = price * (num - 1) / 2 * (1 + 0.5) + price;
        } else {
            totalPrice = price * num / 2 * (1 + 0.5);
        }
        return totalPrice/num;
    }

}
