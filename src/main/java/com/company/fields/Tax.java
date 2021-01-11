package com.company.fields;

import com.company.player.Player;

public class Tax extends Field{

    int taxFee;
    String subText;

    public Tax(String name, int price, String subText) {
        super(name);
        this.taxFee = price;
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

    @Override
    public void landOn(Player playerName) {
        super.landOn(playerName);
        System.out.println("pay your debt " + getTaxFee());
    }
}
