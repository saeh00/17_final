package com.company;

import com.company.fields.*;
import com.company.player.Player;
import gui_fields.GUI_Ownable;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    private Player[] player;
    private String numberPlayers;
    private GUI gui;
    private int[] carField = new int[5];
    private int turn = 0;
    private int[] tempCarField = new int[5];
    //private Player[] isOwner;
    private Player isOwner;

    Dice dice = new Dice();
    private Object Field;

    public GameController(GUI gui) {
        this.gui = gui;
    }

    public void boardSetup() {

        numberPlayers = gui.getUserSelection("Antal spillere:", "2", "3", "4", "5", "6");
        player = new Player[Integer.parseInt(numberPlayers)];
        for (int i = 0; i < player.length; i++) {
            Color colors = null;
            String color = gui.getUserSelection("Vælg en farve", "Blå", "Rød", "Gul", "Grøn", "Hvid", "Sort");
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
        tempCarField[playerNr] = carField[playerNr];

        if ((carField[playerNr] + dice.getSum()) >= 40) {
            carField[playerNr] = carField[playerNr] - 40;
        }
        carField[playerNr] += dice.getSum();

        gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), true);

        buyField(FieldGUI.fields[carField[playerNr]], player[playerNr], playerNr);

    }

    public void checkIfPassedStart(int playerNr) {
        if (carField[playerNr] < tempCarField[playerNr]) {
            gui.showMessage("Tillykke du har passeret start, du modtager 4000 kr.");

            player[playerNr].getGui_player().setBalance(player[playerNr].getGui_player().getBalance() + 4000);

        }

    }

    public void buyField(Field field, Player player, int playerNr) {
        if (field instanceof Street) {
            if (((Street) field).isOwned() == false) {
                if (gui.getUserLeftButtonPressed("Vil du købe denne grund", "Ja", "Nej")) {
                    ((Street) field).setOwned(true);
                    isOwner = player;
                    player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Street) field).getPrice());
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[carField[playerNr]];
                    ownable.setBorder(player.getGui_player().getPrimaryColor());
                    //player[playerNr] = isOwner[playerNr].setOwner(true);
                } else {
                    ((Street) field).isOwned();
                }

            } else {
                gui.showMessage("Grunden er allerede ejet");
                payRent(FieldGUI.fields[carField[playerNr]], player);
            }

        }

        if (field instanceof Shipping) {
            if (((Shipping) field).isOwned() == false) {
                if (gui.getUserLeftButtonPressed("Vil du købe denne færge", "Ja", "Nej")) {
                    ((Shipping) field).setOwned(true);
                    isOwner = player;
                    player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Shipping) field).getPrice());
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[carField[playerNr]];
                    ownable.setBorder(player.getGui_player().getPrimaryColor());
                    //isOwner[playerNr].setOwner(true);
                } else {
                    ((Shipping) field).isOwned();
                }

            } else {
                gui.showMessage("Færgen er allerede ejet");
                payRent(FieldGUI.fields[carField[playerNr]], player);
            }

            if (field instanceof Brewery) {
                if (((Brewery) field).isOwned() == false) {
                    if (gui.getUserLeftButtonPressed("Vil du købe dette brygeri", "Ja", "Nej")) {
                        ((Brewery) field).setOwned(true);
                        isOwner = player;
                        player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Brewery) field).getPrice());
                        GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[carField[playerNr]];
                        ownable.setBorder(player.getGui_player().getPrimaryColor());
                        //isOwner[playerNr].setOwner(true);
                    } else {
                        ((Brewery) field).isOwned();
                        payRent(FieldGUI.fields[carField[playerNr]], player);
                    }

                } else {
                    gui.showMessage("Bryggeriet er allerede ejet");
                }


            }
        }
    }

    public void payRent(Field field, Player player) {
        if (field instanceof Street) {
            if (((Street) field).isOwned() == true) {
                gui.showMessage("Du er landet på en ejet grund. Du skal derfor betale leje! " + ((Street) field).getPrice());
                player.getGui_player().setBalance(player.getGui_player().getBalance()-((Street) field).getPrice());
                isOwner.getGui_player().setBalance(isOwner.getGui_player().getBalance()+((Street) field).getPrice());
                System.out.println((player.isOwner()));
                System.out.println();

            }

        }

        if (field instanceof Shipping) {
            if (((Shipping) field).isOwned() == true) {
                gui.showMessage("Du er landet på en færge der er ejet. Du skal betale leje! " + ((Shipping) field).getPrice());
                player.getGui_player().setBalance(player.getGui_player().getBalance()-((Shipping) field).getPrice());
                isOwner.getGui_player().setBalance(isOwner.getGui_player().getBalance()+((Shipping) field).getPrice());
                System.out.println((player.isOwner()));
                System.out.println();

            }

        }

        if (field instanceof Brewery) {
            if (((Brewery) field).isOwned() == true) {
                gui.showMessage("Du er landet på et ejet bryggeri og skal betale leje! " + ((Brewery) field).getPrice());
                player.getGui_player().setBalance(player.getGui_player().getBalance()-((Brewery) field).getPrice());
                isOwner.getGui_player().setBalance(isOwner.getGui_player().getBalance()+((Brewery) field).getPrice());
                System.out.println((player.isOwner()));
                System.out.println();

            }

        }
    }

    /*
    else {
            ((Street) field).isOwned();
        }

    } else {
        gui.showMessage("Grunden er allerede ejet");
    }

}

if (field instanceof Shipping) {
    if (((Shipping) field).isOwned() == false) {
        if (gui.getUserLeftButtonPressed("Vil du købe denne færge", "Ja", "Nej")) {
            ((Shipping) field).setOwned(true);
            player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Shipping) field).getPrice());
            GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[carField[playerNr]];
            ownable.setBorder(player.getGui_player().getPrimaryColor());
        } else {
            ((Shipping) field).isOwned();
        }

    } else {
        gui.showMessage("Færgen er allerede ejet");
    }

    if (field instanceof Brewery) {
        if (((Brewery) field).isOwned() == false) {
            if (gui.getUserLeftButtonPressed("Vil du købe dette brygeri", "Ja", "Nej")) {
                ((Brewery) field).setOwned(true);
                player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Brewery) field).getPrice());
                GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[carField[playerNr]];
                ownable.setBorder(player.getGui_player().getPrimaryColor());
            } else {
                ((Brewery) field).isOwned();
            }

        } else {
            gui.showMessage("Bryggeriet er allerede ejet");
        }


    }
}

}

*/
    public void runGame() {
        switch (Integer.parseInt(numberPlayers)) {
            case 3:
                while (true) {
                    switch (turn) {
                        case 0:
                            movePlayer(turn);
                            checkIfPassedStart(turn);
                            turn = 1;
                        case 1:
                            movePlayer(turn);
                            checkIfPassedStart(turn);
                            turn = 2;
                        case 2:
                            movePlayer(turn);
                            checkIfPassedStart(turn);
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
}