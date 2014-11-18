package com.company.anyTest.currency;

import com.company.currency.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CurrencyTest {

    private List<Currency> getCurrenciesOne() {
        List<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(2.0));
        currencies.add(new RMB(6.0));
        currencies.add(new Yen(60.0));
        return currencies;
    }

    private List<Currency> getCurrenciesTwo() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(1.0));
        currencies.add(new RMB(6.0));
        currencies.add(new Yen(60.0));
        return currencies;
    }

    @Test
    public void should_get_the_sum_of_currency_lists_as_dollar() throws Exception {
        Dollar result = Currency.caculate(getCurrenciesOne(), getCurrenciesTwo(), Dollar.class);
        assertThat(result.getClass().toString(), is(Dollar.class.toString()));
        assertThat(result.getValue(), is(1.0));
    }

    @Test
    public void should_get_the_sum_of_currency_lists_as_rmb() throws Exception {
        RMB result = Currency.caculate(getCurrenciesOne(), getCurrenciesTwo(), RMB.class);
        assertThat(result.getClass().toString(), is(RMB.class.toString()));
        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_get_the_sum_of_currency_lists_as_yen() throws Exception {
        Yen result = Currency.caculate(getCurrenciesOne(), getCurrenciesTwo(), Yen.class);
        assertThat(result.getClass().toString(), is(Yen.class.toString()));
        assertThat(result.getValue(), is(60.0));
    }

    @Test
    public void should_compare_1_dollar_and_6_rmb() throws Exception {
        Dollar dollar = new Dollar(1.0);
        RMB rmb = new RMB(6.0);
        assertThat(dollar.compare(rmb), is(0));
    }

    @Test
    public void should_compare_1_dollar_and_5_rmb() throws Exception {
        Dollar dollar = new Dollar(1.0);
        RMB rmb = new RMB(5.0);
        assertThat(dollar.compare(rmb), is(1));
    }

    @Test
    public void should_compare_1_dollar_to_7_rmb() throws Exception {
        Dollar dollar = new Dollar(1.0);
        RMB rmb = new RMB(7.0);
        assertThat(dollar.compare(rmb), is(-1));
    }

}
