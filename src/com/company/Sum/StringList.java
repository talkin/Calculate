package com.company.Sum;

import java.util.List;

/**
 * Created by jtao on 12/5/14.
 */
public class StringList extends TheList<String>{
    private List<String> strings;

    public StringList(List<String> strings) {
        this.strings = strings;
    }

    @Override
    protected String initialize(String sum) {
        return "";
    }

    @Override
    public String add(String sum, String object) {
        return sum + object;
    }
}
