package com.company.Pattern.SingletonPattern;

//单例 ：new实例出来的
//超市，商品条形码，不同用户购买的时候，商品的属性都是一样的，并且外界不能更改
public class SingleObject {

    private static SingleObject instance = null;

    private SingleObject(){}

    public static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
