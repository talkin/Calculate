package com.company.POS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PromotionTest {
    Product book = new Product("book", 20);

    Discount discount = new Discount(0.7);
    SecondHalf secondHalf = new SecondHalf();
    OffWhenFull offWhenFull = new OffWhenFull(100, 20);

    @Test
    public void should_get_14_when_buy_1_book_with_discount_and_secondHalf() throws Exception {
        book.with(discount);
        book.with(secondHalf);
        assertThat(book.buy(1), is(14.0));
    }

    @Test
    public void should_get_21_when_buy_2_books_with_discount_and_secondHalf() throws Exception {
        book.with(discount);
        book.with(secondHalf);
        assertThat(book.buy(2), is(21.0));
    }

    @Test
    public void should_get_35_when_buy_3_books_with_discount_and_secondHalf() throws Exception {
        book.with(discount);
        book.with(secondHalf);
        assertThat(book.buy(3), is(35.0));
    }

    @Test
    public void should_get_70_when_buy_5_books_with_discount_and_offWhenFull() throws Exception {
        book.with(discount);
        book.with(offWhenFull);
        assertThat(book.buy(5), is(70.0));
    }

    @Test
    public void should_get_120_when_buy_10_books_with_discount_and_offWhenFull() throws Exception {
        book.with(discount);
        book.with(offWhenFull);
        assertThat(book.buy(10), is(120.0));
    }

    @Test
    public void should_get_90_when_buy_6_books_with_secondHalf_and_offWhenFull() throws Exception {
        book.with(secondHalf);
        book.with(offWhenFull);
        assertThat(book.buy(6), is(90.0));
    }

    @Test
    public void should_get_90_when_buy_7_books_with_secondHalf_and_offWhenFull() throws Exception {
        book.with(secondHalf);
        book.with(offWhenFull);
        assertThat(book.buy(7), is(90.0));
    }

    @Test
    public void should_get_85_when_buy_10_books_with_discount_and_secondHalf_and_offWhenFull() throws Exception {
        book.with(discount);
        book.with(secondHalf);
        book.with(offWhenFull);
        assertThat(book.buy(10), is(85.0));
    }
}
