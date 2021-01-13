package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Shipping extends Field{

    int price;
    String subText;


    public Shipping(String name, int price, String subText, Color fgcolor, Color bgcolor) {
        super(name, fgcolor, bgcolor);
        this.price = price;
        this.subText = subText;
    }

    @Override
    public void landOn(Player playerName) {
        super.landOn(playerName);
        System.out.println("det her er shipping");
    }
}
