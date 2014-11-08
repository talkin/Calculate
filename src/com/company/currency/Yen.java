package com.company.currency;

public class Yen extends Currency<Yen> {
    private double value;
    private double radio=1;

    public Yen(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getRadio() {
        return radio;
    }

    @Override
    protected Yen newCurrency(double value) {
        return new Yen(value);
    }

}
