package org.example.validation;

import java.util.Scanner;

public class Validation {

    public boolean stairsValidationNumber(Scanner sc){
        return sc.hasNextInt();
    }

    public boolean validateExit(String letter){
        String mayus = letter.toUpperCase();
        return mayus.equals("Y");
    }

    public boolean stairsLimit(int numberOfSteps){
        if (numberOfSteps > 20 || numberOfSteps < -20){
            return false;
        }
        return true;
    }
}
