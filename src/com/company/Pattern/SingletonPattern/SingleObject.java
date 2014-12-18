package com.company.Pattern.SingletonPattern;

/**
 * Created by jtao on 12/18/14.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
