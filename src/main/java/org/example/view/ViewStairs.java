package org.example.view;

import org.example.controller.Stairs;
import org.example.validation.Validation;
import org.fusesource.jansi.Ansi;

import java.util.Scanner;


public class ViewStairs {

    Stairs stairs = new Stairs();
    Validation validation = new Validation();
    Scanner number;
    boolean validate;
    int numberValidate;
    public void stairs(){
        do {
            do {
                System.out.println("Enter a number, this can be positive or negative: ");
                number = new Scanner(System.in);
                validate = validation.stairsValidationNumber(number);
                if (validate) {
                    numberValidate = number.nextInt();
                    if(numberValidate > 0){
                        stairs.climbingStairs(numberValidate);
                    } else if (numberValidate < 0) {
                        stairs.goDownTheStairs(numberValidate);
                    }else{
                        stairs.path();
                    }
                    System.out.println("Do you want to continue? (Y) or other letters to leave");
                    number.nextLine().toUpperCase();
                }
            }while (validation.validateExit(number.nextLine()));
        }while(!validate);
    }
}
