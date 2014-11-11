package com.company.currency;

public class Yen extends Currency<Yen> {

    public Yen() {
        this.radio = 1;
    }

    public Yen(double value) {
        this();
        this.value = value;
    }

    @Override
    protected Yen newCurrency(double value) {
        return new Yen(value);
    }

}
