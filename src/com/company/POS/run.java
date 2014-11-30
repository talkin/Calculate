package com.company.POS;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        Product book = new Product("Book", 60);

        Item itemBook = new Item(book, 3);

        PromotionDiscount discount = new PromotionDiscount(0.7);
        PromotionSecondHalf secondHalf = new PromotionSecondHalf();
        PromotionPriceOver priceUp100 = new PromotionPriceOver(100, 20);

        double totalPrice = itemBook.with(discount).with(secondHalf).with(priceUp100).doSum();
        System.out.println("book的总价 ：" + totalPrice);

        List<Item> shoppingCart = new ArrayList<Item>();
        shoppingCart.add(itemBook);
        System.out.println("购物车中的商品 ：" + shoppingCart);

    }
}