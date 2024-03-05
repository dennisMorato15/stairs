package org.example.view;

import org.example.controller.Stairs;
import org.fusesource.jansi.Ansi;

import java.util.Scanner;


public class ViewStairs {

    Stairs stairs = new Stairs();
    Scanner number = new Scanner(System.in);
    public void stairs(){
        System.out.println("Enter a number, this can be positive or negative: ");
        int responseNumber = number.nextInt();


        //stairs.path(20);
        //stairs.climbingStairs(responseNumber);
        stairs.goDownTheStairs(responseNumber);
    }

}
