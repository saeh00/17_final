package com.company;

import com.company.fields.Field;
import com.company.fields.FieldGUI;
import com.company.player.Player;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    private Player[] player;
    private String numberPlayers;
    private GUI gui;

    public GameController(GUI gui) {
        this.gui = gui;
    }

    public void boardSetup() {


        numberPlayers = gui.getUserSelection("Antal spillere:", "2", "3", "4", "5", "6");
        player = new Player[Integer.parseInt(numberPlayers)];
        for (int i = 0; i < player.length; i++) {
            player[i] = new Player(gui, Color.BLACK);
            gui.addPlayer(player[i].getGui_player());
            gui.getFields()[0].setCar(player[i].getGui_player(), true);
        }


    }



    public static void main(String[] args) {

        GameController controller = new GameController(new GUI(FieldGUI.guiFieldsFactory(FieldGUI.fields)));

        controller.boardSetup();

    }

}
