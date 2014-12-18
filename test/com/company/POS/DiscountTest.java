package com.company.POS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiscountTest {
    Product book = new Product("Book", 20);
    Discount discount = new Discount(0.7);

    @Test
    public void should_one_book_discount() throws Exception {
        book.with(discount);
        double totalPrice = book.buy(1);
        assertThat(totalPrice, is(14.0));
    }

    @Test
    public void should_two_books_discount() throws Exception {
        book.with(discount);
        double totalPrice = book.buy(2);
        assertThat(totalPrice, is(28.0));
    }
}
