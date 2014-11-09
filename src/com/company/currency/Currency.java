package com.company.currency;

import java.util.List;

public abstract class Currency<T extends Currency> {

    public abstract double getValue();

    public abstract double getRadio();

    protected abstract T newCurrency(double value);

    public T add(Currency currency) {
        return newCurrency(getValue() + currency.getValue() * (currency.getRadio()/getRadio()));
    }

    public <R extends Currency> R minus(R currency) throws Exception {
        double value = getValue() * getRadio() / currency.getRadio() - currency.getValue();
        if (value >= 0) {
            return (R)currency.newCurrency(value);
        } else {
            throw new Exception("error");
        }
    }

    public static <R extends Currency> R getSum(List<Currency> currencyList, R currency) throws Exception {
        Yen yen = new Yen(0.0);
        for (Currency currency1 : currencyList) {
            yen = yen.add(currency1);
        }
        return yen.minus(currency);
    }

    public <R extends Currency> R sub(List<Currency> currencyList, R currency) throws Exception {
        R sum = getSum(currencyList, currency);
        return this.minus(sum);
    };

}
