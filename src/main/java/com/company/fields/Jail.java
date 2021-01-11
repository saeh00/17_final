package com.company.fields;

public class Jail extends Field{

    int releaseFee;

    public Jail(String name, int releaseFee) {
        super(name);
        this.releaseFee = releaseFee;
    }
}
