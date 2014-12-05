package com.company.Sum;

import java.util.List;

/**
 * Created by jtao on 12/5/14.
 */
public abstract class TheList<T>{
    public T sum(List<T> list) {
        T sum = null;
        T mySum = initialize(sum);
        for (T object : list) {
            mySum = add(mySum, object);
        }
        return mySum;
    }

    protected abstract T initialize(T sum);

    protected abstract T add(T sum, T object);

}
