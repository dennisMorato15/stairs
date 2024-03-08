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
                System.out.println("Enter a number, this can be positive or negative: ");
                number = new Scanner(System.in);
                validateIfItIsNumber = validation.stairsValidationNumber(number);

                if (validateIfItIsNumber) {
                    numberValidate = number.nextInt();

                    if (validation.stairsLimit(numberValidate)) {
                        if (numberValidate > 0) {
                            stairs.climbingStairs(numberValidate);
                        } else if (numberValidate < 0) {
                            stairs.goDownTheStairs(numberValidate);
                        } else {
                            stairs.path();
                        }

                        System.out.println("Do you want to continue? (Y) or other letters to leave");
                        number.nextLine(); // Consumir la nueva línea después de nextInt()
                    } else {
                        System.out.println("Number of steps exceeds the limit. Please enter a value between -20 and 20.");
                        System.out.println("Try again.");
                        number.nextLine();
                    }
                }
            } while (validation.validateExit(number.nextLine()));

        } while (!validateIfItIsNumber);
    }
}
