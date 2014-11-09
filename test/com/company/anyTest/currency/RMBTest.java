package com.company.anyTest.currency;

import com.company.currency.Currency;
import com.company.currency.Dollar;
import com.company.currency.RMB;
import com.company.currency.Yen;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RMBTest {

    Dollar dollar = new Dollar(1.0);
    RMB rmb = new RMB(6.0);
    RMB rmb2 = new RMB(12.0);
    Yen yen = new Yen(60.0);

    private ArrayList<Currency> getCurrenciesOne() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(1.0));
        currencies.add(new RMB(6.0));
        currencies.add(new Yen(60.0));
        return currencies;
    }

    //---------test add----------
    @Test
    public void should_6_RMB_add_6_RMB_equals_12_RMB() throws Exception {
        assertThat(rmb.add(rmb).getValue(), is(12.0));
    }

    @Test
    public void should_6_RMB_add_1_dollar_equals_12_RMB() throws Exception {
        assertThat(rmb.add(dollar).getValue(), is(12.0));
    }

    @Test
    public void should_6_RMB_add_60_Yen_equals_12_RMB() throws Exception {
        assertThat(rmb.add(yen).getValue(), is(12.0));
    }

    //---------test minus----------
    @Test
    public void should_12_rmb_minus_60_yen_equals_60_yen() throws Exception {
        assertThat(rmb2.minus(yen).getValue(), is(60.0));
    }

    @Test
    public void should_12_rmb_minus_1_dollar_equals_1_dollar() throws Exception {
        assertThat(rmb2.minus(dollar).getValue(), is(1.0));
    }

    @Test
    public void should_12_rmb_minus_6_rmb_equals_6_rmb() throws Exception {
        assertThat(rmb2.minus(rmb).getValue(), is(6.0));
    }

    @Test
    public void should_6_rmb_minus_6_rmb_equals_0() throws Exception {
        assertThat(rmb.minus(rmb).getValue(), is(0.0));
    }

    @Test(expected = Exception.class)
    public void should_6_rmb_minus_12_rmb_throw_exception() throws Exception {
        rmb.minus(rmb2);
    }

    //---------test sub list----------
    @Test
    public void should_24_rmb_minus_currency_list1_equals_1_dollar() throws Exception {
        RMB rmb = new RMB(24.0);
        assertThat(rmb.sub(getCurrenciesOne(), new Dollar(0.0)).getValue(), is(1.0));
    }

    @Test
    public void should_24_rmb_minus_currency_list1_equals_6_rmb() throws Exception {
        RMB rmb = new RMB(24.0);
        assertThat(rmb.sub(getCurrenciesOne(), new RMB(0.0)).getValue(), is(6.0));
    }

    @Test
    public void should_24_rmb_minus_currency_list1_equals_60_yen() throws Exception {
        RMB rmb = new RMB(24.0);
        assertThat(rmb.sub(getCurrenciesOne(), new Yen(0.0)).getValue(), is(60.0));
    }

    @Test(expected = Exception.class)
    public void should_12_rmb_minus_currency_list1_throw_exception() throws Exception {
        RMB rmb = new RMB(12.0);
        rmb.sub(getCurrenciesOne(), new RMB(0.0));
    }
}
