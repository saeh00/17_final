package com.company.fields;

import com.company.player.Player;

public class Parking extends Field{

    String subText;

    public Parking(String name, String subText) {
        super(name);
        this.subText = subText;
    }

    @Override
    public void landOn(Player playerName) {
        super.landOn(playerName);
        System.out.println("det her er Parking");
    }
}
