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
    private int[] carField = new int[5];
    private int turn = 0;

    Dice dice = new Dice();

    public GameController(GUI gui) {
        this.gui = gui;
    }

    public void boardSetup() {


        numberPlayers = gui.getUserSelection("Antal spillere:", "2", "3", "4", "5", "6");
        player = new Player[Integer.parseInt(numberPlayers)];
        for (int i = 0; i < player.length; i++) {
            Color colors = null;
            String color = gui.getUserSelection(player[i].getPlayerName() + " vælg en farve", "Blå", "Rød", "Gul", "Grøn", "Hvid", "Sort");
            switch (color) {
                case "Blå":
                    colors = Color.BLUE;
                    break;
                case "Rød":
                    colors = Color.RED;
                    break;
                case "Gul":
                    colors = Color.yellow;
                    break;
                case "Grøn":
                    colors = Color.green;
                    break;
                case "Hvid":
                    colors = Color.white;
                    break;
                case "Sort":
                    colors = Color.BLACK;
                    break;

            }
            player[i] = new Player(gui, colors);
            gui.addPlayer(player[i].getGui_player());
            gui.getFields()[0].setCar(player[i].getGui_player(), true);
        }

    }

    public void movePlayer(int playerNr) {
        gui.showMessage(player[playerNr].getPlayerName() + " Kast terninger");
        dice.rollDice();
        gui.setDice(dice.firstDice(), dice.secondDice());
        gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), false);

        if ((carField[playerNr] + dice.getSum()) >= 40) {
            carField[playerNr] = carField[playerNr] - 40;
        }
        carField[playerNr] += dice.getSum();

        gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), true);

    }

    public void runGame() {
        switch (Integer.parseInt(numberPlayers)) {
            case 3:
                while (true) {
                    switch (turn) {
                        case 0:
                            movePlayer(turn);
                            turn = 1;
                        case 1:
                            movePlayer(turn);
                            turn = 2;
                        case 2:
                            movePlayer(turn);
                            turn = 0;
                    }
                }


            case 4:
                switch (turn) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 5:

            case 6:
        }
    }


    public static void main(String[] args) {

        GameController controller = new GameController(new GUI(FieldGUI.guiFieldsFactory(FieldGUI.fields)));

        controller.boardSetup();

    }

}