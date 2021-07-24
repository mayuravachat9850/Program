package com.company;

import java.util.Scanner;

public class arraysPrint {
    public static void main(String[] args) {

        int marks[];
        marks= new int[5];
        Scanner input= new Scanner(System.in);
        marks[0]=input.nextInt();
        marks[1]=input.nextInt();
        marks[2]=input.nextInt();
        marks[3]=input.nextInt();
        marks[4]=input.nextInt();

        int rollNumber;
        rollNumber=input.nextInt();
        System.out.println("The student with roll number "+rollNumber+" has scored "+marks[rollNumber]+" marks");
    }
}
//IF n1<n2
//        IF n1<n3
//                DISPLAY "The smallest number entered is " + n1;
//        ELSE
//                DISPLAY "The smallest number entered is " + n3;
//ELSE
//        IF n2<n3
//                DISPLAY "The smallest number entered is " + n2;
//        ELSE
//                DISPLAY "The smallest number entered is " + n3;