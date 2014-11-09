package com.company.currency;

import java.util.List;

public abstract class Currency<T extends Currency> {

    public abstract double getValue();

    public abstract double getRadio();

    protected abstract T newCurrency(double value);

    public T add(Currency currency) {
        return newCurrency(getValue() + currency.getValue() * (currency.getRadio()/getRadio()));
    }

    public <R extends Currency> R minus(R currency) {
        return (R)currency.newCurrency(getValue() * getRadio()/currency.getRadio()  - currency.getValue());
    }

    public static <R extends Currency> R getSum(List<Currency> currencyList, R currency) {
        Yen yen = new Yen(0.0);
        for (Currency currency1 : currencyList) {
            yen = yen.add(currency1);
        }
        return yen.minus(currency);
    };

    public <R extends Currency> R sub(List<Currency> currencyList, R currency) {
        R sum = getSum(currencyList, currency);
        return this.minus(sum);
    };

}
