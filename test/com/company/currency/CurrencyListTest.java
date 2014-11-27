package com.company.currency;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CurrencyListTest {

    private List<Currency> getCurrencies() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(3.0));
        currencies.add(new RMB(12.0));
        currencies.add(new Yen(60.0));
        return currencies;
    }

    private static String getClass(List<Currency> currencyList, int index) {
        return currencyList.get(index).getClass().toString();
    }

    @Test
    public void testName() throws Exception {
        List<Currency> actualList = new CurrencyList(getCurrencies()).sortBy(new CurrencyValueComparator()).get();

        assertThat(actualList.get(0).getValue(), is(60.0));
        assertThat(actualList.get(1).getValue(), is(12.0));
        assertThat(actualList.get(2).getValue(), is(3.0));
    }

    @Test
    public void should_get_the_sum_of_list() throws Exception {
        Dollar result = new CurrencyList(getCurrencies()).sum(Dollar.class);

        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_filter_the_list() throws Exception {
        List<Currency> actualList = new CurrencyList(getCurrencies()).filter(new DollarFilter()).get();

        assertThat(actualList.get(0).getValue(), is(3.0));
        assertThat(getClass(actualList, 0), is(Dollar.class.toString()));
    }

}