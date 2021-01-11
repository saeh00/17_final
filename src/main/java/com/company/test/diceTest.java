package com.company.test;
import com.company.Dice;

import java.util.Scanner;

public class diceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double diceThrow, averageValue, count, diceThrow1;

     /*
     test af vores terning, hvor vi tjekker om dens sandsynlighed passer, i tilfælde med 2 terninger
     skal sandsynligheden være størst for at slå 7, dette tjekker vi ved at kigge på gennemsnitte af alle kast
     */

        Dice dice = new Dice();

        System.out.println("Indtast antal gange terninger skal kastes");


        diceThrow = input.nextInt();
        diceThrow1= diceThrow;
        averageValue = 0;
        count = 0;
        String fejl = "Fejl";



        while (diceThrow >= 0){
            dice.rollDice();
            count+=dice.getSum();
            diceThrow--;

            if (diceThrow == 0) {
                averageValue += count / diceThrow1;
                System.out.println(averageValue);
            }


        }

    }
}