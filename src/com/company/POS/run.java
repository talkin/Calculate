package com.company.POS;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        Product book = new Product("Book", 20);

        Item itemBook = new Item(book, 3);

        PromotionDiscount discount = new PromotionDiscount(0.7);
        PromotionSecondHalf secondHalf = new PromotionSecondHalf();

        double bookNewPrice = itemBook.with(discount).with(secondHalf).getPrice();
        itemBook.setPrice(bookNewPrice);

        System.out.println("book的单价 ：" + itemBook.getPrice());
        System.out.println("book的总价 ：" + itemBook.doSum());

        List<Item> shoppingCart = new ArrayList<Item>();
        shoppingCart.add(itemBook);
        System.out.println("购物车中的商品 ：" + shoppingCart);

    }
}