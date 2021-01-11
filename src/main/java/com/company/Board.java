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

        boardArray[0] = new GUI_Start("Start", "Modtag: 4000", "Modtag kr. 4000,-\nnår de passerer start", Color.RED, Color.BLACK);
        boardArray[1] = new GUI_Street("Rødovrevej", "Pris:  1200", "Rødovrevej", "Leje:  50", new Color(75, 155, 225), Color.BLACK);
        boardArray[2] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[3] = new GUI_Street("Hvidovrevej", "Pris:  1200", "Hvidovrevej", "Leje:  50", new Color(75, 155, 225), Color.BLACK);
        boardArray[4] = new GUI_Tax("Betal\nindkomst-\nskat", "10% el. 4000", "Betal indkomstskat\n10% eller kr. 4000,-", Color.GRAY, Color.BLACK);
        boardArray[5] = new GUI_Shipping("default", "Øresund", "Pris:  4000", "Øresundsredderiet", "Leje:  500", Color.WHITE, Color.BLACK);
        boardArray[6] = new GUI_Street("Roskildevej", "Pris:  2000", "Roskildevej", "Leje:  100", new Color(255, 135, 120), Color.BLACK);
        boardArray[7] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[8] = new GUI_Street("Valby\nLanggade", "Pris:  2000", "Valby Langgade", "Leje:  100", new Color(255, 135, 120), Color.BLACK);
        boardArray[9] = new GUI_Street("Allégade", "Pris:  2400", "Allégade", "Leje:  150", new Color(255, 135, 120), Color.BLACK);
        boardArray[10] = new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        boardArray[11] = new GUI_Street("Frederiks-\nberg Allé", "Pris:  2800", "Frederiksberg Allé", "Leje:  200", new Color(102, 204, 0), Color.BLACK);
        boardArray[12] = new GUI_Brewery("default", "Tuborg", "Pris:  3000", "Tuborg bryggeri", "100 x [Terningslag]", Color.BLACK, Color.WHITE);
        boardArray[13] = new GUI_Street("Bülowsvej", "Pris:  2800", "Bülowsvej", "Leje:  200", new Color(102, 204, 0), Color.BLACK);
        boardArray[14] = new GUI_Street("Gammel Kongevej", "Pris:  3200", "Gammel Kongevej", "Leje:  250", new Color(102, 204, 0), Color.BLACK);
        boardArray[15] = new GUI_Shipping("default", "D.F.D.S.", "Pris:  4000", "D.F.D.S.", "Leje:  500", Color.WHITE, Color.BLACK);
        boardArray[16] = new GUI_Street("Bernstorffsvej", "Pris:  3600", "Bernstorffsvej", "Leje:  300", new Color(153, 153, 153), Color.BLACK);
        boardArray[17] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[18] = new GUI_Street("Hellerupvej", "Pris:  3600", "Hellerupvej", "Leje:  300", new Color(153, 153, 153), Color.BLACK);
        boardArray[19] = new GUI_Street("Strandvejen", "Pris:  4000", "Strandvejen", "Leje:  350", new Color(153, 153, 153), Color.BLACK);
        boardArray[20] = new GUI_Refuge("default", "Helle", "Helle", "Ta' en pause", Color.WHITE, Color.BLACK);
        boardArray[21] = new GUI_Street("Trianglen", "Pris:  4400", "Trianglen", "Leje:  350", Color.RED, Color.BLACK);
        boardArray[22] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[23] = new GUI_Street("Østerbro-\ngade", "Pris:  4400", "Østerbrogade", "Leje:  350", Color.RED, Color.BLACK);
        boardArray[24] = new GUI_Street("Grønningen", "Pris:  4800", "Grønningen", "Leje:  400", Color.RED, Color.BLACK);
        boardArray[25] = new GUI_Shipping("default", "Ø.S.", "Pris:  4000", "Ø.S. redderiet", "Leje:  500", Color.WHITE, Color.BLACK);
        boardArray[26] = new GUI_Street("Bredgade", "Pris:  5200", "Bredgade", "Leje:  450", Color.WHITE, Color.BLACK);
        boardArray[27] = new GUI_Street("Kgs. Nytorv", "Pris:  5200", "Kongens Nytorv", "Leje:  450", Color.WHITE, Color.BLACK);
        boardArray[28] = new GUI_Brewery("default", "Carlsberg", "Pris:  3000", "Carlsberg bryggeri", "100 x [Terningslag]", Color.BLACK, Color.WHITE);
        boardArray[29] = new GUI_Street("Østergade", "Pris:  5600", "Østergade", "Leje:  500", Color.WHITE, Color.BLACK);
        boardArray[30] = new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);
        boardArray[31] = new GUI_Street("Amagertorv", "Pris:  6000", "Amagertorv", "Leje:  550", new Color(255, 255, 50), Color.BLACK);
        boardArray[32] = new GUI_Street("Vimmel-\nskaftet", "Pris:  6000", "Vimmelskaftet", "Leje:  550", new Color(255, 255, 50), Color.BLACK);
        boardArray[33] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[34] = new GUI_Street("Nygade", "Pris:  6400", "Nygade", "Leje:  600", new Color(255, 255, 50), Color.BLACK);
        boardArray[35] = new GUI_Shipping("default", "Bornholm", "Pris:  4000", "Bornholms redderi", "Leje:  500", Color.WHITE, Color.BLACK);
        boardArray[36] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        boardArray[37] = new GUI_Street("Frederiks-\nberggade", "Pris:  7000", "Frederiksberggade", "Leje:  700", new Color(150, 60, 150), Color.WHITE);
        boardArray[38] = new GUI_Tax("Ekstra-\nordinær\nstatsskat", "Betal 2000", "Betal ekstraordinær\nstatsskat: kr. 2000,-", Color.GRAY, Color.BLACK);
        boardArray[39] = new GUI_Street("Rådhuspladsen", "Pris:  8000", "Rådhuspladsen", "Leje:  1000", new Color(150, 60, 150), Color.WHITE);

    }

    public void createBoard() {
        gui = new GUI(boardArray);
    }


    public GUI gui() {
        return gui;
    }
}
