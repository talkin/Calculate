package com.company.anyTest.currency;

import com.company.currency.Dollar;
import com.company.currency.RMB;
import com.company.currency.Yen;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class YenTest {
    Dollar dollar = new Dollar(1.0);
    RMB rmb = new RMB(6.0);
    Yen yen = new Yen(60.0);
    Yen yen2 = new Yen(120.0);

    //---------test add----------
    @Test
    public void should_60_Yen_add_60_Yen_equals_120_Yen() throws Exception {
        Yen result = yen.add(yen);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(120.0));
    }

    @Test
    public void should_60_Yen_add_1_dollar_equals_120_Yen() throws Exception {
        Yen result = yen.add(dollar);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(120.0));
    }

    @Test
    public void should_60_Yen_add_10_RMB_equals_120_Yen() throws Exception {
        Yen result = yen.add(rmb);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(120.0));
    }

    //---------test minus----------
    @Test
    public void should_120_yen_minus_60_yen_equals_60_yen() throws Exception {
        Yen result = yen2.minus(yen);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(60.0));
    }

    @Test
    public void should_120_yen_minus_1_dollar_equals_1_dollar() throws Exception {
        Dollar result = yen2.minus(dollar);
        assertThat(result.getClass().toString(), is(Dollar.class.toString()));
        assertThat(result.getValue(), is(1.0));
    }

    @Test
    public void should_120_yen_minus_6_rmb_equals_6_rmb() throws Exception {
        RMB result = yen2.minus(rmb);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_60_yen_minus_60_yen_equals_0() throws Exception {
        Yen result = yen.minus(yen);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(0.0));
    }

    @Test(expected = Exception.class)
    public void should_60_yen_minus_120_yen_throw_exception() throws Exception {
        yen.minus(yen2);
    }

}
