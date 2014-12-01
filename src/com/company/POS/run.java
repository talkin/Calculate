package com.company.POS;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        Product book = new Product("Book", 60);
        Product apple = new Product("Apple", 8);

        Item itemBook = new Item(book, 3);
        Item itemApple = new Item(apple, 10);

        PromotionDiscount discount = new PromotionDiscount(0.7);
        PromotionSecondHalf secondHalf = new PromotionSecondHalf();
        PromotionTotalPrice totalPriceReduce = new PromotionTotalPrice(100, 20);

        double bookTotalPrice = itemBook.with(discount).with(secondHalf).with(totalPriceReduce).doSum();
        double appleTotalPrice = itemApple.with(discount).doSum();

        System.out.println("book的总价 ：" + bookTotalPrice);
        System.out.println("apple的总价 ：" + appleTotalPrice);

        List<Item> itemList = new ArrayList<Item>();
        itemList.add(itemBook);
        itemList.add(itemApple);

        double sum = sum(itemList);
        Item shoppingCart = new Item(new Product("shoppingCart", sum), 1);
        double sumAfterPromotion = shoppingCart.with(totalPriceReduce).doSum();

        System.out.println("购物车的总价 ：" + sum);
        System.out.println("活动后总价 ：" + sumAfterPromotion);
    }

    private static double sum(List<Item> itemList) {
        double sum = 0;
        for (Item item : itemList) {
            sum += item.doSum();
        }
        return sum;
    }

}