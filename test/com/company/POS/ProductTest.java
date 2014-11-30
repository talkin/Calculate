package com.company.POS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductTest {
    Product book = new Product("book", 60);
    Item item_book = new Item(book, 3);

    PromotionDiscount discount = new PromotionDiscount(0.7);
    PromotionSecondHalf secondHalf = new PromotionSecondHalf();
    PromotionPriceOver priceOver = new PromotionPriceOver(100, 20);

    @Test
    public void should_discount() throws Exception {
        double actualPrice = item_book.with(discount).doSum();
        assertThat(actualPrice, is(126.0));
    }

    @Test
    public void should_second_half() throws Exception {
        double actualPrice = item_book.with(secondHalf).doSum();
        assertThat(actualPrice, is(150.0));
    }

    @Test
    public void should_price_over() throws Exception {
        double actualPrice = item_book.with(priceOver).doSum();
        assertThat(actualPrice, is(160.0));
    }

    @Test
    public void should_discount_and_secondHalf() throws Exception {
        double actualPrice = item_book.with(discount).with(secondHalf).doSum();
        assertThat(actualPrice, is(105.0));
    }

    @Test
    public void should_discount_and_priceOver() throws Exception {
        double actualPrice = item_book.with(discount).with(priceOver).doSum();
        assertThat(actualPrice, is(106.0));
    }

    @Test
    public void should_secondHalf_and_priceOver() throws Exception {
        double actualPrice = item_book.with(secondHalf).with(priceOver).doSum();
        assertThat(actualPrice, is(130.0));
    }

    @Test
    public void should_discount_and_secondHalf_and_priceOver() throws Exception {
        double actualPrice = item_book.with(discount).with(secondHalf).with(priceOver).doSum();
        assertThat(actualPrice, is(85.0));
    }
}
