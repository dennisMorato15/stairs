package org.example.validation;

import java.util.Scanner;

public class Validation {

    public boolean stairsValidationNumber(Scanner sc){
        return sc.hasNextInt();
    }

    public boolean validateExit(String letter){
        return letter.equalsIgnoreCase("N");
    }

    public boolean stairsLimit(int numberOfSteps){
        return numberOfSteps <= 20 && numberOfSteps >= -20;
    }
}
