package com.company;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Board {
    private GUI gui = null;
    private int i = 0;
    int test = i + 1;

    public final GUI_Field[] boardArray = new GUI_Field[40];

    public Board() {

        boardArray[i] = new GUI_Start("Start", "Modtag: 4000", "Modtag kr. 4000,-\nnår de passerer start", Color.RED, Color.BLACK);
        boardArray[test++] = new GUI_Street("Rødovrevej", "Pris:  1200", "Rødovrevej", "Leje:  120", new Color(75, 155, 225), Color.BLACK);
        boardArray[test++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[test++] = new GUI_Street("Hvidovrevej", "Pris:  1200", "Hvidovrevej", "Leje:  120", new Color(75, 155, 225), Color.BLACK);
        boardArray[test++] = new GUI_Tax("Betal\nindkomst-\nskat", "10% el. 200", "Betal indkomstskat\n10% eller kr. 200,-", Color.GRAY, Color.BLACK);
        boardArray[test++] = new GUI_Shipping("default", "Øresund", "Pris:  4000", "Øresundsredderiet", "Leje:  1000", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Street("Roskildevej", "Pris:  2000", "Roskildevej", "Leje:  40", new Color(255, 135, 120), Color.BLACK);
        boardArray[test++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[test++] = new GUI_Street("Valby\nLanggade", "Pris:  2000", "Valby Langgade", "Leje:  40", new Color(255, 135, 120), Color.BLACK);
        boardArray[test++] = new GUI_Street("Allégade", "Pris:  2400", "Allégade", "Leje:  45", new Color(255, 135, 120), Color.BLACK);
        boardArray[test++] = new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        boardArray[test++] = new GUI_Street("Frederiks-\nberg Allé", "Pris:  2800", "Frederiksberg Allé", "Leje:  50", new Color(102, 204, 0), Color.BLACK);
        boardArray[test++] = new GUI_Brewery("default", "Tuborg", "Pris:  3000", "Tuborg bryggeri", "10 x [Terningslag]", Color.BLACK, Color.WHITE);
        boardArray[test++] = new GUI_Street("Bülowsvej", "Pris:  2800", "Bülowsvej", "Leje:  50", new Color(102, 204, 0), Color.BLACK);
        boardArray[test++] = new GUI_Street("Gammel Kongevej", "Pris:  3200", "Gammel Kongevej", "Leje:  50", new Color(102, 204, 0), Color.BLACK);
        boardArray[test++] = new GUI_Shipping("default", "D.F.D.S.", "Pris:  4000", "D.F.D.S.", "Leje:  75", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Street("Bernstorffsvej", "Pris:  180", "Bernstorffsvej", "Leje:  60", new Color(153, 153, 153), Color.BLACK);
        boardArray[test++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[test++] = new GUI_Street("Hellerupvej", "Pris:  180", "Hellerupvej", "Leje:  60", new Color(153, 153, 153), Color.BLACK);
        boardArray[test++] = new GUI_Street("Strandvejen", "Pris:  180", "Strandvejen", "Leje:  60", new Color(153, 153, 153), Color.BLACK);
        boardArray[test++] = new GUI_Refuge("default", "Helle", "Helle", "Ta' en pause", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Street("Trianglen", "Pris:  220", "Trianglen", "Leje:  70", Color.RED, Color.BLACK);
        boardArray[test++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[test++] = new GUI_Street("Østerbro-\ngade", "Pris:  220", "Østerbrogade", "Leje:  70", Color.RED, Color.BLACK);
        boardArray[test++] = new GUI_Street("Grønningen", "Pris:  240", "Grønningen", "Leje:  80", Color.RED, Color.BLACK);
        boardArray[test++] = new GUI_Shipping("default", "Ø.S.", "Pris:  200", "Ø.S. redderiet", "Leje:  75", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Street("Bredgade", "Pris:  260", "Bredgade", "Leje:  80", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Street("Kgs. Nytorv", "Pris:  260", "Kongens Nytorv", "Leje:  80", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Brewery("default", "Carlsberg", "Pris:  150", "Carlsberg bryggeri", "10 x [Terningslag]", Color.BLACK, Color.WHITE);
        boardArray[test++] = new GUI_Street("Østergade", "Pris:  280", "Østergade", "Leje:  85", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);
        boardArray[test++] = new GUI_Street("Amagertorv", "Pris:  300", "Amagertorv", "Leje:  95", new Color(255, 255, 50), Color.BLACK);
        boardArray[test++] = new GUI_Street("Vimmel-\nskaftet", "Pris:  300", "Vimmelskaftet", "Leje:  95", new Color(255, 255, 50), Color.BLACK);
        boardArray[test++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[test++] = new GUI_Street("Nygade", "Pris:  320", "Nygade", "Leje:  100", new Color(255, 255, 50), Color.BLACK);
        boardArray[test++] = new GUI_Shipping("default", "Bornholm", "Pris:  200", "Bornholms redderi", "Leje:  75", Color.WHITE, Color.BLACK);
        boardArray[test++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[test++] = new GUI_Street("Frederiks-\nberggade", "Pris:  350", "Frederiksberggade", "Leje:  120", new Color(150, 60, 150), Color.WHITE);
        boardArray[test++] = new GUI_Tax("Ekstra-\nordinær\nstatsskat", "Betal 100", "Betal ekstraordinær\nstatsskat: kr. 100,-", Color.GRAY, Color.BLACK);
        boardArray[test++] = new GUI_Street("Rådhuspladsen", "Pris:  400", "Rådhuspladsen", "Leje:  150", new Color(150, 60, 150), Color.WHITE);

    }

    public void createBoard() {
        gui = new GUI(boardArray);
    }


    public GUI gui() {
        return gui;
    }
}

