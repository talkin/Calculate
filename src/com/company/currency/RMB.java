package com.company.currency;

public class RMB extends Currency<RMB>{

    public RMB() {
        this.radio = 10;
    }
    public RMB(double value) {
        this();
        this.value = value;
    }

    @Override
    protected RMB newCurrency(double value) {
        return new RMB(value);
    }

}
