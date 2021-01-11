package com.company.fields;

import com.company.player.Player;

public abstract class Field {

    String name;

    public Field(String name) {
        this.name = name;
    }

    public void landOn(Player playerName){
        System.out.println(playerName + " is here");

    }
}
