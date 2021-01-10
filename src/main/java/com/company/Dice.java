package com.company;
import java.util.Random;

public class Dice {

    private final Random rand =  new Random();

    private final int[] diceArray = new int[2];   //Et array med indeks 2 oprettes.

    // rollDice, twoSimilar, firsDice, secondDice og getSum metoder laves til terningen.


    public void rollDice(){

        diceArray[0] = rand.nextInt(6) +1;
        diceArray[1]  = rand.nextInt(6) +1;

    }

    public boolean twoSimilar(){

        return diceArray[0] == diceArray[1];
    }

    public int firsDice(){
        return diceArray[0];
    }

    public int secondDice(){
        return diceArray[1];
    }

    public int getSum(){
        return diceArray[0] + diceArray[1];
    }













}
