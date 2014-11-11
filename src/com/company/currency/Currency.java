package com.company.currency;

import java.util.List;

public abstract class Currency<T extends Currency> {

    protected double value;
    protected double radio;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getRadio() {
        return radio;
    }

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

    public static <R extends Currency> R caculate(List<Currency> List1, List<Currency> List2, Class<R> currencyClass) throws Exception {
        R r1 = getSum(List1, currencyClass);
        R r2 = getSum(List2, currencyClass);
        r1.setValue(r1.getValue()-r2.getValue());
        return r1;
    }

    private static <R extends Currency> R getSum(List<Currency> List, Class<R> currencyClass) throws InstantiationException, IllegalAccessException {
        R r = currencyClass.newInstance();
        for (Currency currency:List) {
            r = (R)r.add(currency);
        }
        return r;
    }


}
