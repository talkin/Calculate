package com.company.POS;

import java.util.ArrayList;
import java.util.List;

//商品类
public class Product {
    private String name;
    private double price;
    private List<Promotion> promotionList = new ArrayList<Promotion>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void with(Promotion promotion) {
        promotionList.add(promotion);
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }

    public double buy(int num) {
        double finalPrice = price;
        for (Promotion promotion : promotionList) {
            finalPrice = promotion.changePrice(finalPrice, num);
        }
        return finalPrice * num;
    }
}
