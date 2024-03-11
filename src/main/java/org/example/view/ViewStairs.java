package org.example.view;

import org.example.controller.Stairs;
import org.example.validation.Validation;
import org.fusesource.jansi.Ansi;

import java.util.Scanner;


public class ViewStairs {
    Stairs stairs = new Stairs();
    Validation validation = new Validation();
    Scanner number = new Scanner(System.in);
    public void showStairs(){
        System.out.println("Enter a decimal number between -20 and 20 (or 'N-n' to exit)");
        while (number.hasNext()) {
            if (validation.stairsValidationNumber(number)) {
                int numberValidation = number.nextInt();
                if (validation.stairsLimit(numberValidation)) {
                    if (numberValidation < 0) {
                        stairs.goDownTheStairs(numberValidation);
                    } else if (numberValidation > 0) {
                        stairs.climbingStairs(numberValidation);
                    } else {
                        stairs.path();
                    }
                    System.out.println("well done!!! try again. Remember that to leave it is with the letter (n/N)");
                } else {
                    System.out.println("The step limit is 20 or -20");
                    System.out.println("Try again ->");
                }
            } else {
                String exit = number.next();
                if (validation.validateExit(exit)) {
                    System.out.println("Leaving the program... ");
                    break;
                } else {
                    System.out.println("The data entered is not valid");
                    System.out.println("Try again -> ");
                }
            }
        }
    }
}
