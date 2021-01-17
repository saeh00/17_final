package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Street extends Field {

    int price;
    String subText;
    boolean owned;
    int rent;

    public Street(String name, int price, String subText, Color fgcolor, Color bgcolor, int rent) {
        super(name, fgcolor, bgcolor);
        this.price = price;
        this.subText = subText;
        this.owned = false;
        this.rent = rent;
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRent() {
        return rent;
    }
}
