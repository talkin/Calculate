package com.company.POS;

//购物车中的Items
public class Item {
    private Product product;
    private double price;
    private int num;

    public Item(Product product, int num) {
        this.product = product;
        this.price = product.getPrice();
        this.num = num;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double doSum() {
        return price * num;
    }

    public Item with(Promotion promotion) {
        this.setPrice(promotion.changePrice(this));
        return this;
    }

}
