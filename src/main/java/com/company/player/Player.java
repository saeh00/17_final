package com.company.player;


import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Player {

    private final GUI_Player gui_player;
    private final String playerName;
    private boolean isOwner = false;

    public Player(GUI gui, Color color) {

        playerName = gui.getUserString("input player name");
        GUI_Car car = new GUI_Car();
        car.setPrimaryColor(color);

        gui_player = new GUI_Player(playerName, 30000, car);

        gui.addPlayer(gui_player);

    }

    public String getPlayerName() {
        return playerName;
    }

    public GUI_Player getGui_player() {
        return gui_player;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }
}
