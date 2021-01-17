package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Shipping extends Field{

    int price;
    String subText;
    boolean owned;
    int rent;


    public Shipping(String name, int price, String subText, Color fgcolor, Color bgcolor, int rent) {
        super(name, fgcolor, bgcolor);
        this.price = price;
        this.subText = subText;
        this.owned = false;
        this.rent = rent;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOwned() {
        return owned;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public int getRent() {
        return rent;
    }
}
