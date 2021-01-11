package com.company.fields;

import com.company.player.Player;

public class Jail extends Field{

    int releaseFee;

    public Jail(String name, int releaseFee) {
        super(name);
        this.releaseFee = releaseFee;
    }

    @Override
    public void landOn(Player playerName) {
        super.landOn(playerName);
        System.out.println("det her er habez");
    }
}
