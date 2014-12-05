package com.company.Sum;

import java.util.List;

/**
 * Created by jtao on 12/5/14.
 */
public class IntegerList extends TheList<Integer>{
    private List<Integer> integers;

    public IntegerList(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    protected Integer initialize(Integer sum) {
        return 0;
    }

    @Override
    public Integer add(Integer sum, Integer object) {
        return sum + object;
    }
}
