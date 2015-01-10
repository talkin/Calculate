package com.company.practiceTest;

/**
 * Created by jtao on 1/9/15.
 */
public class Calculate {

    private Condition condition;

    public Calculate(Condition condition) {
        this.condition = condition;
    }

    public int add(int one, int two) {
        if (condition.isPositive(one, two) && condition.isAbove(one, two)) {
            return one + two;
        } else
            return 0;
    }

}
