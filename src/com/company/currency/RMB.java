package com.company.currency;

public class RMB extends Currency<RMB>{

    private double value;
    private double radio = 10;

    public RMB() {}
    public RMB(double value) {
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
    protected RMB newCurrency(double value) {
        return new RMB(value);
    }

}
