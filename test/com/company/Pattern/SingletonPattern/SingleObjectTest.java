package com.company.Pattern.SingletonPattern;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SingleObjectTest {

    @Test
    public void testGetInstance() throws Exception {
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();
        assertSame(instance1, instance2);
    }
}