package org.example.validation;

import java.util.Scanner;

public class Validation {

    public boolean stairsValidationNumber(Scanner sc){
        if (sc.hasNextInt()){
            return true;
        }else {
            return false;
        }
    }
}
