package com.company;

import com.company.fields.FieldGUI;
import gui_main.GUI;

public class Main {

    public static void main(String[] args) {
        GameController controller = new GameController(new GUI(FieldGUI.guiFieldsFactory(FieldGUI.fields)));

        controller.boardSetup();


        

    }
}