package org.example.controller;


public class Stairs {
    public void climbingStairs(){
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public void goDownTheStairs(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void path(int number) {

    }
}
