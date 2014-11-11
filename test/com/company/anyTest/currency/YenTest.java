package com.company.anyTest.currency;

import com.company.currency.Currency;
import com.company.currency.Dollar;
import com.company.currency.RMB;
import com.company.currency.Yen;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class YenTest {
    Dollar dollar = new Dollar(1.0);
    RMB rmb = new RMB(6.0);
    Yen yen = new Yen(60.0);
    Yen yen2 = new Yen(120.0);

    private ArrayList<Currency> getCurrenciesOne() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(1.0));
        currencies.add(new RMB(6.0));
        currencies.add(new Yen(60.0));
        return currencies;
    }

    //---------test add----------
    @Test
    public void should_60_Yen_add_60_Yen_equals_120_Yen() throws Exception {
        assertThat(yen.add(yen).getValue(), is(120.0));
    }

    @Test
    public void should_60_Yen_add_1_dollar_equals_120_Yen() throws Exception {
        assertThat(yen.add(dollar).getValue(), is(120.0));
    }

    @Test
    public void should_60_Yen_add_10_RMB_equals_120_Yen() throws Exception {
        assertThat(yen.add(rmb).getValue(), is(120.0));
    }

    //---------test minus----------
    @Test
    public void should_120_yen_minus_60_yen_equals_60_yen() throws Exception {
        assertThat(yen2.minus(yen).getValue(), is(60.0));
    }

    @Test
    public void should_120_yen_minus_1_dollar_equals_1_dollar() throws Exception {
        assertThat(yen2.minus(dollar).getValue(), is(1.0));
    }

    @Test
    public void should_120_yen_minus_6_rmb_equals_6_rmb() throws Exception {
        RMB result = yen2.minus(rmb);
        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_60_yen_minus_60_yen_equals_0() throws Exception {
        assertThat(yen.minus(yen).getValue(), is(0.0));
    }

    @Test(expected = Exception.class)
    public void should_60_yen_minus_120_yen_throw_exception() throws Exception {
        yen.minus(yen2);
    }

}
