package com.student.main;


import com.student.util.GradeCalc;

import java.util.Scanner;

/**
 * Created by Md Shadman Hasan on 4/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of subjects: ");
        int numberOfSub = scan.nextInt();
        double [] subjectArray = new double[numberOfSub];
        for(int i = 0; i < numberOfSub; i++) {
            System.out.print("Please enter the mark for subject " + (i + 1) + ":");
            subjectArray[i] = scan.nextDouble();
        }

        GradeCalc gc = new GradeCalc(subjectArray);

        double cgpa = gc.getGrade();
        System.out.println("Your Grade is: " + cgpa);
        System.out.println("Your Grade is: " + calcGrade(cgpa));
    }

    private static String calcGrade(double cgpa) {

        String grade = "F";

        if(cgpa == 5)
            grade = "A+";
        else if(cgpa > 4)
            grade = "A";
        else if(cgpa > 3.5)
            grade = "A-";
        else if(cgpa > 3)
            grade = "B";
        else if(cgpa > 2)
            grade = "C";
        else if(cgpa > 1)
            grade = "D";

        return grade;
    }
}
