package com.company.fields;

public class Shipping extends Field{

    int price;
    String subText;

    public Shipping(String name, int price, String subText) {
        super(name);
        this.price = price;
        this.subText = subText;
    }
}
