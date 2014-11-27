package com.company.currency;

public class DollarFilter implements Condition<Currency> {
    @Override
    public boolean match(Currency object) {
        return object instanceof Dollar;
    }
}
