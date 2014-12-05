package com.company.Sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumTest {
    List<Integer> integers = new ArrayList<Integer>();
    IntegerList integerList = new IntegerList(integers);

    List<String> strings = new ArrayList<String>();
    StringList stringList = new StringList(strings);

    @Before
    public void setUp() throws Exception {
        integers.add(1);
        integers.add(2);

        strings.add("hello ");
        strings.add("Jing");
    }

    @Test
    public void should_get_the_sum_of_Integer_list() throws Exception {
        Integer result = integerList.sum(integers);
        assertThat(result, is(3));
    }

    @Test
    public void should_get_the_sum_of_String_list() throws Exception {
        String result = stringList.sum(strings);
        assertThat(result, is("hello Jing"));
    }
}
