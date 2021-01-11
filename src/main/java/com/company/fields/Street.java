package com.company.fields;

import com.company.player.Player;

public class Street extends Field {

    int price;
    String subText;

    public Street(String name, int price, String subText) {
        super(name);
        this.price = price;
        this.subText = subText;
    }

    @Override
    public void landOn(Player playerName) {
        super.landOn(playerName);
        System.out.println("det her er street");
    }
}
