package com.company;

import java.io.File;
import java.util.Scanner;

public class TryNCatch {
    public static void main(String args[]) {


        try {
            //creating File instance to reference text file in Java
            File inputfile = new File("C:\\Users\\lenovo\\Downloads\\no.txt"); // Mention the path to the file here

            Scanner scan = new Scanner(inputfile);

            while (scan.hasNextLine() == true) {

                String line = scan.nextLine();
                System.out.println(line);
            }

            scan.close();

        } catch (Exception e) {
            System.out.print("File not found");
        }
    }
}
