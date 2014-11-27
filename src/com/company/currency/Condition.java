package com.company.currency;

public interface Condition<T> {
    boolean match(T type);
}
