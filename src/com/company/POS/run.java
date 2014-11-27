package com.company.POS;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        Item itemBook = new Item("book", 20);

        Product book = new Product(itemBook, 3);

        PromotionDiscount discount = new PromotionDiscount(0.7);
        PromotionSecondHalf secondHalf = new PromotionSecondHalf();

        double bookNewPrice = book.with(discount).with(secondHalf).getNewPrice();
        book.setNewPrice(bookNewPrice);

        System.out.println("book的单价 ：" + book.getNewPrice());
        System.out.println("book的总价 ：" + book.doSum());

        List<Product> shoppingCart = new ArrayList<Product>();
        shoppingCart.add(book);
        System.out.println("购物车中的商品 ：" + shoppingCart);

    }
}