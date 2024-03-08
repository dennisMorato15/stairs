package org.example.controller;


public class Stairs {
    public void climbingStairs(int number){
        for (int i = number ; i >= 0; i--) {
            for (int k = 0; k < i; k++){
                System.out.print("  ");
            }
            if (i == number){
                System.out.println("_💒");
            }else {
                System.out.println("__|");
            }
        }
    }
    public void goDownTheStairs(int number){
        System.out.println("🏡_");
        for (int i = number; i < 0; i++) {
            for (int j = number; j <= i; j++) {
            System.out.print(" ");
        }
        System.out.println("|__");
        }
    }
    public void path() {
        System.out.println("\uD83C\uDF33___________\uD83C\uDF33___________🌄");
    }
}
