package module3;

import java.util.Scanner;

public class asset {
    public static void main(String args[]) throws Exception {
        Scanner scan =new Scanner(System.in);
        try{
            ///System.out.println("6+54+654");
            System.out.println("Enter Number: ");
            int number = scan.nextInt();
            System.out.println("Enter Name: ");
            String name = scan.next();
            System.out.println("Enter value: ");
            double value = scan.nextDouble();
            System.out.println(number);
            System.out.println(name);
            System.out.println(value);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
