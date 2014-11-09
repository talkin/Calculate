package com.company.anyTest.currency;

import com.company.currency.Currency;
import com.company.currency.Dollar;
import com.company.currency.RMB;
import com.company.currency.Yen;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CurrencyTest {

    private ArrayList<Currency> getCurrenciesOne() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(1.0));
        currencies.add(new RMB(6.0));
        currencies.add(new Yen(60.0));
        return currencies;
    }

    private ArrayList<Currency> getCurrenciesTwo() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(1.0));
        currencies.add(new RMB(1.0));
        currencies.add(new Yen(10.0));
        return currencies;
    }

    private ArrayList<Currency> getCurrenciesThree() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(3.0));
        currencies.add(new RMB(5.0));
        currencies.add(new Yen(4.0));
        return currencies;
    }

    @Test
    public void should_get_the_sum_of_currency_list1() throws Exception {

        assertThat(Currency.getSum(getCurrenciesOne(), new Dollar(0.0)).getValue(), is(3.0));
    }

    @Test
    public void should_get_the_sum_of_currency_list2() throws Exception {

        assertThat(Currency.getSum(getCurrenciesTwo(), new RMB(0.0)).getValue(), is(8.0));
    }

    @Test
    public void should_get_the_sum_of_currency_list3() throws Exception {

        assertThat(Currency.getSum(getCurrenciesThree(), new Yen(0.0)).getValue(), is(234.0));
    }

}
