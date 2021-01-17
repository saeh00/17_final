package com.company;

import com.company.fields.FieldGUI;
import com.company.player.Player;
import gui_main.GUI;

public class Main {

    private Player[] player;

    public static void main(String[] args) {
        GUI gui = new GUI(FieldGUI.guiFieldsFactory(FieldGUI.fields));

        GameController gameController = new GameController(gui);


        gameController.boardSetup();

        gameController.runGame();


    }
}