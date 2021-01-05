package com.company;

import gui_main.GUI;

public class Game {
    static Board board = new Board();

    public static void main(String[] args) {

        GUI.setNull_fields_allowed(true);

        board.createBoard();
    }


}
