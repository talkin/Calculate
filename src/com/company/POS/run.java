package com.company.POS;

import java.util.HashMap;
import java.util.Map;

public class run {
    public static void main(String[] args) {

        Discount discount = new Discount(0.7);
        SecondHalf secondHalf = new SecondHalf();
        OffWhenFull offWhenFull = new OffWhenFull(100, 20);

        Product book = new Product("book", 20);
        book.with(discount);
        book.with(secondHalf);
        book.with(offWhenFull);

        System.out.println("book的总价 ：" + book.buy(10));

        Product apple = new Product("apple", 5);
        apple.with(discount);
        System.out.println("apple的总价 ：" + apple.buy(8));

        Map<Product, Integer> shoppingCart = new HashMap<Product, Integer>();
        shoppingCart.put(book, 10);
        shoppingCart.put(apple, 8);

        System.out.println("购物车的总价 ：" + sum(shoppingCart));
    }

    private static double sum(Map<Product, Integer> shoppingCart) {
        double price = 0;
        for (Map.Entry<Product, Integer> entry : shoppingCart.entrySet()) {
            Product product = entry.getKey();
            Integer num = entry.getValue();
            price += product.buy(num);
        }
        return price;
    }

}