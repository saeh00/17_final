package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Jail extends Field{

    int releaseFee;
    String subText;


    public Jail(String name, String subText ,Color fgcolor, Color bgcolor, int releaseFee) {
        super(name, fgcolor, bgcolor);
        this.releaseFee = releaseFee;
        this.subText = subText;
    }



}
