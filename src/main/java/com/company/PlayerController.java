package com.company;

import com.company.player.Player;
import gui_main.GUI;

import java.awt.*;

public class PlayerController {

    private Player[] player;
    private String numberPlayers;
    private GUI gui;
    private int turn = 0;
    private int[] carField = new int[5];

    Dice dice = new Dice();

    public PlayerController(GUI gui) {
        this.gui = gui;
    }

    public void movePlayer(int playerNr){
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
