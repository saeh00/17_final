package com.company.fields;

public class Street extends Field {

    int price;
    String subText;

    public Street(String name, int price, String subText) {
        super(name);
        this.price = price;
        this.subText = subText;
    }
}
