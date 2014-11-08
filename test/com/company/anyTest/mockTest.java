package com.company.anyTest;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class mockTest {

    Book book = mock(Book.class);

    @Test
    public void testName() throws Exception {

        when(book.getName()).thenReturn("world");

        assertThat(book.getName(), is("world"));

    }

    @Test
    public void testId() throws Exception {
        book.getName();
        book.getId();

        when(1000).thenReturn(13);//记录最近的一次调用

        assertThat(book.getId(), is(13));

    }

    @Test
    public void testPrice() throws Exception {
        book.getName();

        when(book.getName()).thenThrow(new RuntimeException());

        doThrow(Exception.class).when(book).getPrice();

    }


    class Book {

        public String getName() {
            return "hello";
        }

        public void getPrice() {}

        public int getId() {
            return 12;
        }
    }

}
