package com.company.currency;

public class Dollar extends Currency<Dollar>{

    private double value;
    private double radio=60;

    public Dollar() {}

    public Dollar(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getRadio() {
        return radio;
    }

    @Override
    protected Dollar newCurrency(double value) {
        return new Dollar(value);
    }

}
