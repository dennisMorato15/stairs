package org.example.view;

import org.example.controller.Stairs;
import org.example.validation.Validation;
import org.fusesource.jansi.Ansi;

import java.util.Scanner;


public class ViewStairs {

    Stairs stairs = new Stairs();
    Validation validation = new Validation();
    Scanner number;
    boolean validateIfItIsNumber;
    int numberValidate;
    public void stairs(){
        do {
            do {
                System.out.println("Enter an integer, this can be positive or negative: ");
                number = new Scanner(System.in);
                validateIfItIsNumber = validation.stairsValidationNumber(number);

                if (validateIfItIsNumber) {
                    do {
                        numberValidate = number.nextInt();
                        if (validation.stairsLimit(numberValidate)) {
                            if (numberValidate > 0) {
                                stairs.climbingStairs(numberValidate);
                            } else if (numberValidate < 0) {
                                stairs.goDownTheStairs(numberValidate);
                            } else {
                                stairs.path();
                            }
                        } else {
                            System.out.println("Number of steps exceeds the limit. Please enter a value between -20 and 20.");
                            System.out.println("Try again.");
                            number.nextLine();
                        }
                    } while (!validation.stairsLimit(numberValidate));
                }
                            System.out.println("Do you want to continue? (Y) or other letters to leave");
                            number.nextLine();

            } while (validation.validateExit(number.nextLine()));
        } while (!validateIfItIsNumber);
    }
}
