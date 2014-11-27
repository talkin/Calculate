package com.company.POS;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        Product book = new Product("Book", 20);

        Item itemBook = new Item(book, 3);

        PromotionDiscount discount = new PromotionDiscount(0.7);
        PromotionSecondHalf secondHalf = new PromotionSecondHalf();

        double totalPrice = itemBook.with(discount).with(secondHalf).doSum();
        System.out.println("book的总价 ：" + totalPrice);

        List<Item> shoppingCart = new ArrayList<Item>();
        shoppingCart.add(itemBook);
        System.out.println("购物车中的商品 ：" + shoppingCart);

    }
}