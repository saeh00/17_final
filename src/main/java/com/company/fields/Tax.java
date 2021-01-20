package com.company.fields;

import java.awt.*;

public class Tax extends Field{

    int taxFee;
    String subText;


    public Tax(String name, int taxFee, String subText, Color fgcolor, Color bgcolor) {
        super(name, fgcolor, bgcolor);
        this.taxFee = taxFee;
        this.subText = subText;
    }


    // Vores metoder i Tax bliver ikke benyttet, da vi ikke har implementeret det i koden


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
