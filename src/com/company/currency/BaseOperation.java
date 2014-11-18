package com.company.currency;

import java.util.List;

public class BaseOperation {

    public static List<Currency> sort(List<Currency> currencies) {
        List<Currency> result = currencies;
        for (int i=0; i<result.size()-1; i++) {
            for (int j=i+1; j<result.size(); j++) {
                if (result.get(i).compare(result.get(j)) > 0) {
                    Currency currency1 = result.get(i);
                    Currency currency2 = result.get(j);
                    int index1 = result.indexOf(currency1);
                    int index2 = result.indexOf(currency2);
                    result.remove(currency1);
                    result.remove(currency2);
                    result.add(index1, currency2);
                    result.add(index2, currency1);
                }
            }
        }
        return result;
    }
}
