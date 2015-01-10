package com.company.practiceTest;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by jtao on 1/9/15.
 */
public class CalculateTest {

    Condition condition;
    Calculate calculate;

    @Before
    public void setUp() throws Exception {
        condition = mock(Condition.class);
        calculate = new Calculate(condition);
    }

    @Test
    public void should_return_3_when_2_add_1() throws Exception {
        when(condition.isPositive(any(Integer.class), any(Integer.class))).thenReturn(true);
        when(condition.isAbove(any(Integer.class), any(Integer.class))).thenReturn(true);

        calculate.add(any(Integer.class), any(Integer.class));

        verify(condition).isPositive(any(Integer.class), any(Integer.class));
        verify(condition).isAbove(any(Integer.class), any(Integer.class));
        assertThat(calculate.add(2, 1), is(3));
    }

    @Test
    public void should_return_0_when_1_add_2() throws Exception {
        when(condition.isPositive(any(Integer.class), any(Integer.class))).thenReturn(true);
        when(condition.isAbove(any(Integer.class), any(Integer.class))).thenReturn(false);
        calculate.add(any(Integer.class), any(Integer.class));

        verify(condition).isPositive(any(Integer.class), any(Integer.class));
        verify(condition).isAbove(any(Integer.class), any(Integer.class));

        assertThat(calculate.add(1, 2), is(0));
    }

    @Test
    public void should_return_0_when_2_add_negative1() throws Exception {
        when(condition.isPositive(any(Integer.class), any(Integer.class))).thenReturn(false);
        when(condition.isAbove(any(Integer.class), any(Integer.class))).thenReturn(true);
        calculate.add(any(Integer.class), any(Integer.class));

        verify(condition).isPositive(any(Integer.class), any(Integer.class));
        //verify method is not called
        verify(condition, never()).isAbove(any(Integer.class), any(Integer.class));

        assertThat(calculate.add(2, -1), is(0));
    }

    @Test
    public void should_return_0_when_negative1_add_2() throws Exception {
        when(condition.isPositive(any(Integer.class), any(Integer.class))).thenReturn(false);
        when(condition.isAbove(any(Integer.class), any(Integer.class))).thenReturn(false);
        calculate.add(any(Integer.class), any(Integer.class));

        verify(condition).isPositive(any(Integer.class), any(Integer.class));
        //verify method is not called
        verify(condition, times(0)).isAbove(any(Integer.class), any(Integer.class));

        assertThat(calculate.add(-1, 2), is(0));
    }
}
