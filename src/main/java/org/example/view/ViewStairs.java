package org.example.view;

import org.example.controller.Stairs;
import org.example.validation.Validation;
import org.fusesource.jansi.Ansi;

import java.util.Scanner;


public class ViewStairs {

    Stairs stairs = new Stairs();
    Validation validation = new Validation();
    Scanner number = new Scanner(System.in);
    int numberValidate;
    public void stairs(){
        System.out.println("Enter a number, this can be positive or negative: ");
        if(validation.stairsValidationNumber(number)){
            numberValidate = number.nextInt();
            System.out.println(numberValidate);
        }else{
            System.out.println("dato no valido");
        }
        //int responseNumber = number.nextInt();



        //stairs.path(20);
        //stairs.climbingStairs(responseNumber);
        //stairs.goDownTheStairs(responseNumber);
    }

}
