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
        Dollar result = dollar.add(dollar);
        assertThat(result.getValue(), is(2.0));
    }

    @Test
    public void should_1_dollar_add_6_RMB_equals_2_dollars() throws Exception {
        Dollar result = dollar.add(rmb);
        assertThat(result.getValue(), is(2.0));
    }

    @Test
    public void should_1_dollar_add_60_Yen_equals_2_dollars() throws Exception {
        Dollar result = dollar.add(yen);
        assertThat(result.getValue(), is(2.0));
    }

    //---------test minus----------
    @Test
    public void should_2_dollar_minus_1_dollar_equals_1_dollar() throws Exception {
        Dollar result = dollar2.minus(dollar);
        assertThat(result.getValue(), is(1.0));
    }

    @Test
    public void should_2_dollar_minus_6_RMB_equals_6_RMB() throws Exception {
        RMB result = dollar2.minus(rmb);
        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_2_dollar_minus_60_Yen_equals_60_Yen() throws Exception {
        Yen result = dollar2.minus(yen);
        assertThat(result.getValue(), is(60.0));
    }

    //---------test sub list----------
    @Test
    public void should_4_dollar_minus_currency_list1_equals_1_dollar() throws Exception {
        Dollar dollar = new Dollar(4.0);
        Dollar result = dollar.sub(getCurrenciesOne(), new Dollar(0.0));
        assertThat(result.getValue(), is(1.0));
    }

    @Test
    public void should_4_dollar_minus_currency_list1_equals_6_rmb() throws Exception {
        Dollar dollar = new Dollar(4.0);
        RMB result = dollar.sub(getCurrenciesOne(), new RMB(0.0));
        assertThat(result.getValue(), is(6.0));
    }

    @Test
    public void should_4_dollar_sub_currency_list1_equals_60_yen() throws Exception {
        Dollar dollar = new Dollar(4.0);
        Yen result = dollar.sub(getCurrenciesOne(), new Yen(0.0));
        assertThat(result.getValue(), is(60.0));
    }

}
