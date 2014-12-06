package com.company.POS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OffWhenFullTest {
    Product book = new Product("Book", 20);
    OffWhenFull off20WhenFull100 = new OffWhenFull(100, 20);

    @Test
    public void should_not_get_20_off_when_not_reach_100() throws Exception {
        book.with(off20WhenFull100);
        double totalPrice = book.buy(4);
        assertThat(totalPrice, is(80.0));
    }

    @Test
    public void should_get_20_off_when_reach_100() throws Exception {
        book.with(off20WhenFull100);
        double totalPrice = book.buy(6);
        assertThat(totalPrice, is(100.0));
    }
}
