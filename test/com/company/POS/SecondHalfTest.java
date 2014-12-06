package com.company.POS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SecondHalfTest {
    Product book = new Product("Book", 20);
    SecondHalf secondHalf = new SecondHalf();

    @Test
    public void should_one_book_secondHalf() throws Exception {
        book.with(secondHalf);
        double totalPrice = book.buy(1);
        assertThat(totalPrice, is(20.0));
    }

    @Test
    public void should_two_books_secondHalf() throws Exception {
        book.with(secondHalf);
        double totalPrice = book.buy(2);
        assertThat(totalPrice, is(30.0));
    }

    @Test
    public void should_three_books_secondHalf() throws Exception {
        book.with(secondHalf);
        double totalPrice = book.buy(3);
        assertThat(totalPrice, is(50.0));
    }
}
