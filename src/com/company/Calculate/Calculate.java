package com.company.Calculate;

public class Calculate {
    public static final float DISCOUNT = 0.5f;
    protected float result;
    private Currency inputCurrency;
    private float taxRate;

    public Calculate add(Float numberOne, Float numberTwo) {
        result = (numberOne + numberTwo);
        return this;
    }

    public Calculate sub(Float numberOne, Float numberTwo) {
        result = (numberOne - numberTwo);
        return this;
    }

    public Calculate mul(Float numberOne, Float numberTwo) {
        result = numberOne * numberTwo;
        return this;
    }

    public Calculate div(Float numberOne, Float numberTwo) {
        result = numberOne / numberTwo;
        return this;
    }

    public float getResult(Currency outCurrency) {
        float resultWithoutDeduction = result * inputCurrency.getRatio() / outCurrency.getRatio();

        return inputCurrency.equals(outCurrency) ? resultWithoutDeduction : resultWithoutDeduction * resultWithDeduction(outCurrency);
    }

    private float resultWithDeduction(Currency outCurrency) {
        if (result * inputCurrency.getRatio() >= 1000f) {
            return (1 - inputCurrency.getFee() * DISCOUNT) * (1 - outCurrency.getFee() * DISCOUNT);
        }
        return (1 - inputCurrency.getFee()) * (1 - outCurrency.getFee());
    }

    public void withInputRatio(Currency currency) {
        inputCurrency = currency;
    }

}
