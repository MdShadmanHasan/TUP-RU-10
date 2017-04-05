package com.calc.simplecalc;
import java.util.Scanner;

/**
 * Created by Md Shadman Hasan on 4/1/2017.
 */
public class SimpleCalc {
    public static void main(String[] args) throws NullPointerException {
        System.out.println("This Is A Simple Calculator Program!");
        Scanner input = new Scanner(System.in);
        String choice = null;

        do {
            System.out.println("Enter What You Would Like To Do.");
            System.out.println("(1) Addition");
            System.out.println("(2) Subtraction");
            System.out.println("(3) Multiplication");
            System.out.println("(4) Division");
            System.out.println("Input A for Addition, S for Subtraction, M for Multiplication or D for Division");
            choice = input.nextLine();
        } while(!choice.equals("A") || !choice.equals("S") || !choice.equals("M") || !choice.equals("D"));
    }
}
