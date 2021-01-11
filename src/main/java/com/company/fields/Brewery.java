package com.company.fields;

public class Brewery extends Field {

    int price;
    String subText;


    public Brewery(String name, int price, String subText) {
        super(name);
        this.price = price;
        this.subText = subText;
    }
}
