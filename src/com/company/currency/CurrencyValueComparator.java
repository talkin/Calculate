package com.company.currency;

import java.util.Comparator;

public class CurrencyValueComparator implements Comparator<Currency> {
    @Override
    public int compare(Currency o1, Currency o2) {
        return Double.compare(o1.getValue() * o1.getRadio(), o2.getValue() * o2.getRadio());
    }
}
