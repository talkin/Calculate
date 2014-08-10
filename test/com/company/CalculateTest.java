package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {

    Calculate calculate;

    @Test
    public void testAdd() throws Exception {
        Float numberOne = 1.0f;
        Float numberTwo = 2.0f;
        Float result = calculate.add(numberOne, numberTwo);

        assertThat(result, is(3.0f));

    }

    @Test
    public void testSub() throws Exception {
        Float numberOne = 8.5f;
        Float numberTwo = 2.3f;
        Float result = calculate.sub(numberOne, numberTwo);

        assertThat(result, is(6.2f));

    }

    @Test
    public void testMul() throws Exception {
        Float numberOne = 1.5f;
        Float numberTwo = 2.0f;
        Float result = calculate.mul(numberOne, numberTwo);

        assertThat(result, is(3.0f));

    }

    @Test
    public void testDiv() throws Exception {
        Float numberOne = 9.0f;
        Float numberTwo = 2.0f;
        Float result = calculate.div(numberOne, numberTwo);

        assertThat(result, is(4.5f));

    }
}