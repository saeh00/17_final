package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Parking extends Field{

    String subText;

    public Parking(String name, String subText, Color fgcolor, Color bgcolor) {
        super(name, fgcolor, bgcolor);
        this.subText = subText;
    }

}
