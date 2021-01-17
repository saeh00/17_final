package com.company;

import com.company.fields.*;
import com.company.player.Player;
import gui_fields.GUI_Ownable;
import gui_main.GUI;

import java.awt.*;
import java.util.Random;

public class GameController {

    private Player[] player;
    private String numberPlayers;
    private GUI gui;
    private int[] carField = new int[5];
    private int turn = 0;
    private int[] tempCarField = new int[5];
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

        chanceField(FieldGUI.fields[carField[playerNr]],playerNr);
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

    public void payRent(Field field, Player player) {
        if (field instanceof Street) {
            if (((Street) field).isOwned() == true) {
                gui.showMessage("Du er landet på en ejet grund. Du skal derfor betale leje! " + ((Street) field).getRent());
                player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Street) field).getRent());
                isOwner.getGui_player().setBalance(isOwner.getGui_player().getBalance() + ((Street) field).getRent());

            }

        }

        if (field instanceof Shipping) {
            if (((Shipping) field).isOwned() == true) {
                gui.showMessage("Du er landet på en færge der er ejet. Du skal betale leje! " + ((Shipping) field).getRent());
                player.getGui_player().setBalance(player.getGui_player().getBalance() - ((Shipping) field).getRent());
                isOwner.getGui_player().setBalance(isOwner.getGui_player().getBalance() + ((Shipping) field).getRent());

            }

        }

        if (field instanceof Brewery) {
            if (((Brewery) field).isOwned() == true) {
                gui.showMessage("Du er landet på et ejet bryggeri og skal betale leje! " + (((Brewery) field).getRent()) * dice.getSum());
                player.getGui_player().setBalance(player.getGui_player().getBalance() - (((Brewery) field).getRent()) * dice.getSum());
                isOwner.getGui_player().setBalance(isOwner.getGui_player().getBalance() + (((Brewery) field).getRent()) * dice.getSum());

            }

        }
    }

    public void chanceField(Field field, int playerNr){
        if (field instanceof Chance) {
            gui.showMessage("Du er landet på chancefeltet");

            Random rand = new Random();
            int answer = rand.nextInt(3);
            if (answer == 0) {
                gui.showMessage("Ryk 3 felter frem");
                gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), false);
                carField[playerNr] = carField[playerNr] + 3;

                gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), true);
            } else if (answer == 1) {
                gui.showMessage("Ryke 2 felter tilbage");
                gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), false);
                carField[playerNr] = carField[playerNr] - 2;

                gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), true);
            } else {
                gui.showMessage("Ryke direkte til fængsel");
                gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), false);
                carField[playerNr] = 10;

                gui.getFields()[carField[playerNr]].setCar(player[playerNr].getGui_player(), true);
            }
        }
    }

    public void checkPlayerBalance() {
        for (int i = 0; i < player.length; i++) {
            if (player[i].getGui_player().getBalance() <= 0) {
                gui.showMessage(player[i].getGui_player().getName() + " er gået fallit");

                getWinner();
            }
        }
    }

    public void getWinner() {
        int player1Balance = player[0].getGui_player().getBalance();
        String player1Name = player[0].getGui_player().getName();
        int winnerBalance;
        String winnerName = null;

        for (int i = 0; i < player.length; i++) {
            if (player[i].getGui_player().getBalance() > player1Balance) {
                winnerBalance = player[i].getGui_player().getBalance();
                winnerName = player[i].getGui_player().getName();
            }
        }
        gui.showMessage(winnerName + " Har vundet spillet med den højeste med pengebeholdning");

        gui.close();

    }


    public void runGame() {
        switch (Integer.parseInt(numberPlayers)) {
            case 3:
                while (true) {
                    switch (turn) {
                        case 0:
                            movePlayer(turn);
                            checkIfPassedStart(turn);
                            checkPlayerBalance();
                            turn = 1;
                        case 1:
                            movePlayer(turn);
                            checkIfPassedStart(turn);
                            checkPlayerBalance();
                            turn = 2;
                        case 2:
                            movePlayer(turn);
                            checkIfPassedStart(turn);
                            checkPlayerBalance();
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