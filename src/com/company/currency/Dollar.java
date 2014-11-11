package com.company.currency;

public class Dollar extends Currency<Dollar>{

    public Dollar() {
        this.radio = 60;
    }

    public Dollar(double value) {
        this();
        this.value = value;
    }

    @Override
    protected Dollar newCurrency(double value) {
        return new Dollar(value);
    }

}
