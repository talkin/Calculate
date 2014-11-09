package com.company.anyTest.currency;

import com.company.currency.Currency;
import com.company.currency.Dollar;
import com.company.currency.RMB;
import com.company.currency.Yen;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DollarTest {
    Dollar dollar = new Dollar(1.0);
    Dollar dollar2 = new Dollar(2.0);
    RMB rmb = new RMB(6.0);
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
    public void should_1_dollar_add_1_dollar_equals_2_dollar() throws Exception {
        assertThat(dollar.add(dollar).getValue(), is(2.0));
    }

    @Test
    public void should_1_dollar_add_6_RMB_equals_2_dollars() throws Exception {
        assertThat(dollar.add(rmb).getValue(), is(2.0));
    }

    @Test
    public void should_1_dollar_add_60_Yen_equals_2_dollars() throws Exception {
        assertThat(dollar.add(yen).getValue(), is(2.0));
    }

    //---------test minus----------
    @Test
    public void should_2_dollar_minus_1_dollar_equals_1_dollar() throws Exception {
        assertThat(dollar2.minus(dollar).getValue(), is(1.0));
    }

    @Test
    public void should_2_dollar_minus_6_RMB_equals_6_RMB() throws Exception {
        assertThat(dollar2.minus(rmb).getValue(), is(6.0));
    }

    @Test
    public void should_2_dollar_minus_60_Yen_equals_60_Yen() throws Exception {
        assertThat(dollar2.minus(yen).getValue(), is(60.0));
    }

    @Test
    public void should_1_dollar_minus_1_dollar_equals_0() throws Exception {
        assertThat(dollar.minus(dollar).getValue(), is(0.0));
    }

    @Test(expected = Exception.class)
    public void should_1_dollar_minus_2_dollar_throw_exception() throws Exception {
        dollar.minus(dollar2);
    }

    //---------test sub list----------
    @Test
    public void should_4_dollar_minus_currency_list1_equals_1_dollar() throws Exception {
        Dollar dollar = new Dollar(4.0);
        assertThat(dollar.sub(getCurrenciesOne(), new Dollar(0.0)).getValue(), is(1.0));
    }

    @Test
    public void should_4_dollar_minus_currency_list1_equals_6_rmb() throws Exception {
        Dollar dollar = new Dollar(4.0);
        assertThat(dollar.sub(getCurrenciesOne(), new RMB(0.0)).getValue(), is(6.0));
    }

    @Test
    public void should_4_dollar_sub_currency_list1_equals_60_yen() throws Exception {
        Dollar dollar = new Dollar(4.0);
        assertThat(dollar.sub(getCurrenciesOne(), new Yen(0.0)).getValue(), is(60.0));
    }

    @Test(expected = Exception.class)
    public void should_2_dollar_minus_currency_list1_throw_exception() throws Exception {
        Dollar dollar = new Dollar(2.0);
        dollar.sub(getCurrenciesOne(), new Dollar(0.0));
    }

}
