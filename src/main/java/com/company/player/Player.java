package com.company.player;


import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Player {

    private final GUI_Player gui_player;

    private final String playerName;

    public Player(GUI gui, Color color) {

        playerName = gui.getUserString("input player name");
        GUI_Car car = new GUI_Car();
        car.setPrimaryColor(color);

        gui_player = new GUI_Player(playerName,30000,car);

        gui.addPlayer(gui_player);

    }

    public String getPlayerName() {
        return playerName;
    }

    public GUI_Player getGui_player() {
        return gui_player;
    }

    public void movePlayer(GUI gui Player player){
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
}
