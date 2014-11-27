package com.company.currency;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CurrencyList {
    private List<Currency> currencies;

    public CurrencyList(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public CurrencyList sortBy(Comparator<Currency> comparator) {
        Collections.sort(currencies, comparator);
        return this;
    }

    public List<Currency> get() {
        return currencies;
    }

    public <R extends Currency> R sum(Class<R> currencyClass) throws IllegalAccessException, InstantiationException {
        R item = currencyClass.newInstance();
        for (Currency currency:currencies) {
            item = (R)item.add(currency);
        }
        return item;
    }

    public CurrencyList filter(Condition<Currency> condition) {
        for(Currency currency : currencies) {
            if(!condition.match(currency))
                currencies.remove(currency);
        }
        return this;
    }
}
