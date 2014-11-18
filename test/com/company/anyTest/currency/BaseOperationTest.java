package com.company.anyTest.currency;

import com.company.currency.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BaseOperationTest {

    private List<Currency> getCurrencies() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Dollar(2.0));
        currencies.add(new RMB(6.0));
        currencies.add(new Yen(50.0));
        return currencies;
    }

    @Test
    public void should_sort_currencies_list_by_increase() throws Exception {
        List<Currency> actualList = BaseOperation.sort(getCurrencies());
        assertThat(actualList.get(0).getValue(), is(getCurrencies().get(2).getValue()));
        assertThat(actualList.get(0).getClass().toString(), is(getCurrencies().get(2).getClass().toString()));

        assertThat(actualList.get(1).getValue(), is(getCurrencies().get(1).getValue()));
        assertThat(actualList.get(1).getClass().toString(), is(getCurrencies().get(1).getClass().toString()));

        assertThat(actualList.get(2).getValue(), is(getCurrencies().get(0).getValue()));
        assertThat(actualList.get(2).getClass().toString(), is(getCurrencies().get(0).getClass().toString()));
    }
}
