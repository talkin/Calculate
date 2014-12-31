package com.company.OCP;

/**
 * Created by jtao on 12/27/14.
 */
public class Dollar extends Currency {
    private double value;
    private double radio = 6.0;

    public Dollar(double value) {
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
    public double add(Currency currency) {
        return value + currency.getValue() * currency.getRadio()/radio;
    }
}
