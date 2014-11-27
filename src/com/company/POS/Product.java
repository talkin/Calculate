package com.company.POS;

public class Product {
    private Item item;
    private double newPrice;
    private int num;

    public Product(Item item, int num) {
        this.item = item;
        this.newPrice = item.getPrice();
        this.num = num;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double doSum() {
        return newPrice * num;
    }

    public Product with(Promotion promotion) {
        double v = promotion.changePrice(this);
        this.setNewPrice(v);
        return this;
    }

}
