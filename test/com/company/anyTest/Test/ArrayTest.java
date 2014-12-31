package com.company.anyTest.Test;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayTest {

    private Integer[] numbers = {5, 8, 3, 6, 1};

    @Test
    public void should_get_the_length_of_array() throws Exception {

        assertThat(numbers.length, is(5));
    }

    @Test
    public void should_get_the_max_number() throws Exception {

        assertThat(getMax(numbers), is(8));
    }

    @Test
    public void should_get_the_min_number() throws Exception {
        assertThat(getMin(numbers), is(1));

    }

    @Test
    public void should_order_the_numbers() throws Exception {
        Integer[] expected = {1,3,5,6,8};
        Arrays.sort(numbers);
        assertThat(numbers, is(expected));

    }

    private Integer getMin(Integer[] numbers) {
        int min = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    private Integer getMax(Integer[] numbers) {
        int max = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
