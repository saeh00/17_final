package com.company.fields;

public class Tax extends Field{

    int taxFee;
    String subText;

    public Tax(String name, int price, String subText) {
        super(name);
        this.taxFee = price;
        this.subText = subText;
    }
}
