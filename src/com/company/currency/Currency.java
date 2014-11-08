package com.company.currency;

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

}
