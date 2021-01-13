package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public abstract class Field {

    String name;
    Color fgcolor;
    Color bgcolor;


    public Field(String name, Color fgcolor, Color bgcolor) {
        this.name = name;
        this.fgcolor = fgcolor;
        this.bgcolor = bgcolor;
    }

    public void landOn(Player playerName){
        System.out.println(playerName + " is here");

    }
}
