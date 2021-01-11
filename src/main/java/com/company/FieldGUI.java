package com.company;

import com.company.fields.*;
import gui_main.GUI;


import java.awt.*;

public class FieldGUI {

    public FieldGUI(GUI fieldGUI) {
        fieldGUI = new GUI();
    }

    public static void main(String[] args) {
        Field[] fields = {
                new Start("Start"),
        new Street("Rødovrevej", 1200, "Rødovrevej"),
        new Chance("string waow"),
        new Street("Hvidovrevej", 1200, "Hvidovrevej"),
        new Tax("Betal\nindkomst-\nskat", 4000, "Betal indkomstskat\n10% eller kr. 4000,-"),
        new Shipping("Øresund", 4000, "Øresundsredderiet\", \"Leje:  500\":  4000"),
        new Street("Roskildevej", 2000, "Roskildevej"),
        new Chance("chance 2 string"),
        new Street("Valby\nLanggade", 2000, "Valby Langgade"),
        new Street("Allégade", 2400, "Allégade"),
        new Jail("Habez", 10000),
        new Street("Frederiks-\nberg Allé", 2800, "Frederiksberg Allé"),
        new Brewery("bryggeri", 10000, "Pris:  3000 Tuborg bryggeri"),
        new Street("Bülowsvej", 2800, "Bülowsvej"),
        new Street("Gammel Kongevej", 3200, "Gammel Kongevej"),
        new Shipping("D.F.D.S.", 4000, "subtext"),
        new Street("Bernstorffsvej", 3600, "Bernstorffsvej"),
        new Chance("chance 3 string ACK"),
        new Street("Hellerupvej", 3600, "Hellerupvej"),
        new Street("Strandvejen", 4000, "Strandvejen"),
        new Parking("Helle/parkering", "Ta' en pause"),
        new Street("Trianglen", 4400, "Trianglen"),
        new Chance("?"),
        new Street("Østerbro-\ngade", 4400, "Østerbrogade"),
        new Street("Grønningen", 4800, "Grønningen"),
        new Shipping("Ø.S. redderiet", 4000, "Pris:  4000"),
        new Street("Bredgade", 5200, "Bredgade"),
        new Street("Kgs. Nytorv", 5200, "Kongens Nytorv"),
        new Brewery("Carlsberg", 3000, "Carlsberg bryggeri pris: 3000"),
        new Street("Østergade", 5600, "Østergade"),
        new Jail("Her eller habez", 10000),
        new Street("Amagertorv", 6000, "Amagertorv"),
        new Street("Vimmel-\nskaftet", 6000, "Vimmelskaftet"),
        new Chance("chance ?"),
        new Street("Nygade", 6400, "Nygade"),
        new Shipping("Bornholms redderi", 4000, "Pris:  4000"),
        new Chance("? chance"),
        new Street("Frederiks-\nberggade", 7000, "Frederiksberggade"),
        new Tax("Ekstra-\nordinær\nstatsskat", 2000, "Betal ekstraordinær\nstatsskat: kr. 2000,-"),
        new Street("Rådhuspladsen", 8000, "Rådhuspladsen"),

    };

    }

}