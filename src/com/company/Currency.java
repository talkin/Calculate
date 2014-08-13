package com.company;

public enum Currency {

    CNY(1.0f, 0f),
    USD(6.0f, 0.2f),
    INR(0.1f, 0.15f);

    private final float ratio;
    private float fee;

    Currency(float ratio, float fee) {
        this.ratio = ratio;
        this.fee = fee;
    }

    public float getRatio() {
        return ratio;
    }

    public float getFee() {
        return fee;
    }

    public static Currency parse(String input) {
        for (Currency currency : Currency.values()) {
            if (currency.name().equals(input)) {
                return currency;
            }
        }

        return CNY;
    }

}
