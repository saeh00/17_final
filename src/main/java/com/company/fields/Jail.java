package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Jail extends Field{

    int releaseFee;

    public Jail(String name, int releaseFee, Color fgcolor, Color bgcolor) {
        super(name, fgcolor, bgcolor);
        this.releaseFee = releaseFee;
    }


    @Override
    public void landOn(Player playerName) {
        super.landOn(playerName);
        System.out.println("det her er habez");
    }
}
