package com.company.OCP;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jtao on 12/27/14.
 */
public class CurrencyTest {
    @Test
    public void should_get_7_rmb_when_1_rmb_add_1_dollar() throws Exception {
        RMB rmb = new RMB(1.0);
        Dollar dollar = new Dollar(1.0);
        assertThat(rmb.add(dollar), is(7.0));
    }

    @Test
    public void should_get_2_dollar_when_6_rmb_add_1_dollar() throws Exception {
        RMB rmb = new RMB(6.0);
        Dollar dollar = new Dollar(1.0);
        assertThat(dollar.add(rmb), is(2.0));
    }
}
