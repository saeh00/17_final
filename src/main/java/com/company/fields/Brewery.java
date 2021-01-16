package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Brewery extends Field {

    int price;
    String subText;
    boolean owned;

    public Brewery(String name, int price, String subText, Color fgcolor, Color bgcolor) {
        super(name, fgcolor, bgcolor);
        this.price = price;
        this.subText = subText;
        this.owned = false;
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
}
