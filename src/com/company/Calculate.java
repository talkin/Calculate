package com.company;

public abstract class Calculate {
    protected static Float result;

    public Float add(Float numberOne, Float numberTwo) {
        result = numberOne + numberTwo;
        return result * getRatio();
    }

    public Float sub(Float numberOne, Float numberTwo) {
        result = numberOne - numberTwo;
        return result * getRatio();
    }

    public Float mul(Float numberOne, Float numberTwo) {
        result = numberOne * numberTwo;
        return result * getRatio();
    }

    public Float div(Float numberOne, Float numberTwo) {
        result = numberOne/numberTwo;
        return result * getRatio();
    }

    protected  abstract float getRatio();
}
