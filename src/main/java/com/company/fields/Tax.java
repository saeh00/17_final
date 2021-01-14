package com.company.fields;

import com.company.player.Player;

import java.awt.*;

public class Tax extends Field{

    int taxFee;
    String subText;


    public Tax(String name, int taxFee, String subText, Color fgcolor, Color bgcolor) {
        super(name, fgcolor, bgcolor);
        this.taxFee = taxFee;
        this.subText = subText;
    }



    public void setTaxFee(int taxFee) {
        this.taxFee = taxFee;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public int getTaxFee() {
        return taxFee;
    }

    public String getSubText() {
        return subText;
    }

    public void payTaxFee(){

    }

}
