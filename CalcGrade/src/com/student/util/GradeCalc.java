package com.student.util;

/**
 * Created by Md Shadman Hasan on 4/1/2017.
 */
public class GradeCalc {
    private double [] subArray;

    /**
     * <p>The Public constructor for GradeCalc class</p>
     *
     * @param givenArray {@link Double[]} array of subject
     */
    public GradeCalc(double [] givenArray) {
        subArray = givenArray;
    }

    public double getGrade() {
        double totalGrade = 0.0;

        for (double mark : subArray)
            totalGrade += getSingleSubGrade(mark);
        return totalGrade / subArray.length;
    }

    private double getSingleSubGrade(double subMark) {
        double grade = 0.0;

        if(subMark >= 80)
            grade = 5;
        else if(subMark >= 70)
            grade = 4;
        else if(subMark >=60)
            grade = 3.5;
        else if(subMark >= 50)
            grade = 3.0;
        else if(subMark >= 40)
            grade = 2.0;
        else if(subMark >= 33)
            grade = 1.0;

        return grade;
    }
}
