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
        System.out.println("\u001B[33mTexto en café\u001B[0m");
        System.out.println(Ansi.ansi().fg(Ansi.Color.RED).a("This text is red!").reset());
        String texto = "TextO";
        System.out.println("\u001B[38;2;" + 139 + ";" + 69 + ";" + 19 + "m" + texto + "\u001B[0m");

        // Print green text with bold style
        System.out.println(Ansi.ansi().fg(Ansi.Color.GREEN).a("This text is green and bold!").bold().reset());

        // Combine multiple colors and styles
        System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).bg(Ansi.Color.YELLOW).a("This text is blue on a yellow background and bold!").bold().reset());

        stairs.path(20);
        //stairs.climbingStairs();
        stairs.goDownTheStairs();

    }

}
