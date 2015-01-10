package com.company.practiceTest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jtao on 1/10/15.
 */
public class ConditionTest {
    Condition condition = new Condition();

    @Test
    public void should_return_true_when_1_add_2() throws Exception {
        assertThat(condition.isPositive(1, 2), is(true));
    }

    @Test
    public void should_return_true_when_negative1_add_negative2() throws Exception {
        assertThat(condition.isPositive(-1, -2), is(true));
    }

    @Test
    public void should_return_false_when_0_add_0() throws Exception {
        assertThat(condition.isPositive(0, 0), is(false));
    }

    @Test
    public void should_return_false_when_negative1_add_2() throws Exception {
        assertThat(condition.isPositive(-1, 2), is(false));
    }

    @Test
    public void should_return_false_when_2_add_negative1() throws Exception {
        assertThat(condition.isPositive(2, -1), is(false));
    }

    @Test
    public void should_return_false_when_negative1_add_0() throws Exception {
        assertThat(condition.isPositive(-1, 0), is(false));
    }

    @Test
    public void should_return_false_when_0_add_negative1() throws Exception {
        assertThat(condition.isPositive(0, -1), is(false));
    }

    @Test
    public void should_return_false_when_1_add_0() throws Exception {
        assertThat(condition.isPositive(1, 0), is(false));
    }

    @Test
    public void should_return_false_when_0_add_1() throws Exception {
        assertThat(condition.isPositive(0, 1), is(false));
    }

    @Test
    public void should_return_true_when_2_add_1() throws Exception {
        assertThat(condition.isAbove(2, 1), is(true));
    }

    @Test
    public void should_return_false_when_1_add_2() throws Exception {
        assertThat(condition.isAbove(1, 2), is(false));
    }
}
