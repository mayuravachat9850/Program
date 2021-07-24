package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("C:\\Users\\lenovo\\Downloads\\no.txt"); // Specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int numb = 1;
        int sum = 0;

        while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
            int number = scan.nextInt();
            sum = sum + number;
        }

        System.out.println("Sum is : " + sum);
    }
}
