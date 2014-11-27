package com.company.currency;

import com.company.currency.Dollar;
import com.company.currency.RMB;
import com.company.currency.Yen;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RMBTest {

    Dollar dollar = new Dollar(1.0);
    RMB rmb = new RMB(6.0);
    RMB rmb2 = new RMB(12.0);
    Yen yen = new Yen(60.0);

    //---------test add----------
    @Test
    public void should_6_RMB_add_6_RMB_equals_12_RMB() throws Exception {
        RMB result = rmb.add(rmb);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(12.0));
    }

    @Test
    public void should_6_RMB_add_1_dollar_equals_12_RMB() throws Exception {
        RMB result = rmb.add(dollar);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(12.0));
    }

    @Test
    public void should_6_RMB_add_60_Yen_equals_12_RMB() throws Exception {
        RMB result = rmb.add(yen);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(12.0));
    }

    //---------test minus----------
    @Test
    public void should_12_rmb_minus_60_yen_equals_60_yen() throws Exception {
        Yen result = rmb2.minus(yen);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(60.0));
    }

    @Test
    public void should_12_rmb_minus_1_dollar_equals_1_dollar() throws Exception {
        Dollar result = rmb2.minus(dollar);
        assertThat(result.getClass().toString(), is(Dollar.class.toString()));
        assertThat(result.getValue(), is(1.0));
    }

    @Test
    public void should_12_rmb_minus_6_rmb_equals_6_rmb() throws Exception {
        RMB result = rmb2.minus(rmb);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_6_rmb_minus_6_rmb_equals_0() throws Exception {
        RMB result = rmb.minus(rmb);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(0.0));
    }

    @Test(expected = Exception.class)
    public void should_6_rmb_minus_12_rmb_throw_exception() throws Exception {
        rmb.minus(rmb2);
    }

}
