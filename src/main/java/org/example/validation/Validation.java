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
}
