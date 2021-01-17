package com.company.fields;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class FieldGUI {


        public static Field[] fields = {
                new Start("Start", Color.BLACK, Color.red),
                new Street("Rødovrevej", 1200, "1200 kr", Color.BLACK,Color.BLUE, 50),
                new Chance("Chancekort", Color.WHITE, Color.BLACK),
                new Street("Hvidovrevej", 1200, "1200 kr", Color.BLACK, Color.BLUE, 50),
                new Tax("Betal\nindkomst-\nskat", 4000, "Betal kr. 4000,-", Color.BLACK, Color.WHITE),
                new Shipping("Øresund", 4000, "4000 Kr Leje:  500" , Color.BLACK, Color.blue, 500),
                new Street("Roskildevej", 2000, "2000 kr", Color.BLACK, Color.orange, 100),
                new Chance("Chancekort", Color.white, Color.BLACK),
                new Street("Valby\nLanggade", 2000, "2000 kr", Color.BLACK, Color.orange, 100),
                new Street("Allégade", 2400, "2400 kr", Color.BLACK, Color.orange, 150),
                new Jail("Fængsel", "Fængsel" , Color.WHITE, Color.BLACK, 1000),
                new Street("Frederiks-\nberg Allé", 2800, "2800 kr", Color.BLACK, Color.yellow,200),
                new Brewery("bryggeri", 3000, "3000 kr. Leje: 100kr. * terningslag", Color.BLACK, Color.RED,100),
                new Street("Bülowsvej", 2800, "2800 kr", Color.BLACK, Color.orange, 200),
                new Street("Gammel Kongevej", 3200, "3200 kr", Color.BLACK, Color.orange, 250),
                new Shipping("D.F.D.S.", 4000, "4000 Kr Leje:  500", Color.BLACK, Color.RED, 500),
                new Street("Bernstorffsvej", 3600, "3600 kr", Color.BLACK, Color.gray, 300),
                new Chance("Chancekort", Color.WHITE, Color.BLACK),
                new Street("Hellerupvej", 3600, "3600 kr", Color.BLACK, Color.gray, 300),
                new Street("Strandvejen", 4000, "4000 kr", Color.BLACK, Color.gray,350),
                new Parking("Helle/parkering", "Ta' en pause", Color.BLACK, Color.BLUE),
                new Street("Trianglen", 4400, "4400 kr", Color.BLACK, Color.red,350),
                new Chance("Chancekort", Color.WHITE, Color.BLACK),
                new Street("Østerbro-\ngade", 4400, "4400 kr", Color.BLACK, Color.red,350),
                new Street("Grønningen", 4800, "4800 kr", Color.BLACK, Color.red,400),
                new Shipping("Ø.S. redderiet", 4000, "4000 Kr Leje:  500", Color.BLACK, Color.blue, 500),
                new Street("Bredgade", 5200, "5200 kr", Color.BLACK, Color.white,450),
                new Street("Kgs. Nytorv", 5200, "5200 kr", Color.BLACK, Color.white,450),
                new Brewery("Carlsberg", 3000, "3000 kr. Leje: 100 * terningslag", Color.BLACK, Color.red, 100),
                new Street("Østergade", 5600, "5600 kr", Color.BLACK, Color.white,500),
                new Jail("Fængsel", "Fængsel", Color.WHITE, Color.BLACK, 1000),
                new Street("Amagertorv", 6000, "6000 kr", Color.BLACK, Color.yellow,550),
                new Street("Vimmel-\nskaftet", 6000, "6000 kr", Color.BLACK, Color.yellow, 550),
                new Chance("Chancekort", Color.WHITE, Color.BLACK),
                new Street("Nygade", 6400, "6400 kr", Color.BLACK, Color.yellow, 600),
                new Shipping("Bornholms redderi", 4000, "4000 Kr Leje:  500", Color.BLACK, Color.BLUE, 500),
                new Chance("Chancekort", Color.WHITE, Color.BLACK),
                new Street("Frederiks-\nberggade", 7000, "7000 kr", Color.BLACK, Color.PINK, 700),
                new Tax("Ekstra-\nordinær\nstatsskat", 2000, "Betal kr. 2000,-", Color.BLACK, Color.WHITE),
                new Street("Rådhuspladsen", 8000, "8000 kr", Color.BLACK, Color.PINK, 1000),

        };


    public static GUI_Field[] guiFieldsFactory(Field[] fields) {
        GUI_Field[] gui_fields = new GUI_Field[fields.length];
        for (int i = 0; i < fields.length; i++) {

            if (fields[i] instanceof Street) {
                gui_fields[i] = new GUI_Street();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setSubText(((Street) fields[i]).subText);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Chance) {
                gui_fields[i] = new GUI_Chance();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Jail) {
                gui_fields[i] = new GUI_Jail();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setSubText(((Jail) fields[i]).subText);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Tax) {
                gui_fields[i] = new GUI_Tax();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setSubText(((Tax) fields[i]).subText);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Start) {
                gui_fields[i] = new GUI_Start();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Shipping) {
                gui_fields[i] = new GUI_Shipping();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setSubText(((Shipping) fields[i]).subText);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Brewery) {
                gui_fields[i] = new GUI_Brewery();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setSubText(((Brewery) fields[i]).subText);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);

            } else if (fields[i] instanceof Parking) {
                gui_fields[i] = new GUI_Refuge();
                gui_fields[i].setTitle(fields[i].name);
                gui_fields[i].setSubText(((Parking) fields[i]).subText);
                gui_fields[i].setBackGroundColor(fields[i].bgcolor);
                gui_fields[i].setForeGroundColor(fields[i].fgcolor);
            }
        }
        return gui_fields;
    }
}

