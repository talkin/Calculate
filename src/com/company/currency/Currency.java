package com.company.currency;

import java.util.List;

public abstract class Currency<T extends Currency> {

    public abstract double getValue();

    public abstract void setValue(double value);

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

    public static <R extends Currency> R getSum(List<Currency> List1, List<Currency> List2, Class<R> currencyClass) throws Exception {
        R r1 = currencyClass.newInstance();
        R r2 = currencyClass.newInstance();
        for (Currency currency:List1) {
            r1 = (R)r1.add(currency);
        }
        for (Currency currency:List2) {
            r2 = (R)r2.add(currency);
        }

        r1.setValue(r1.getValue()-r2.getValue());

        return r1;
    }


}
