package module3;

import java.util.Scanner;

public class modulefunction {
    public static void main(String[] args) {
        int inputNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        inputNumber = sc.nextInt();

        for(int i = 2; i< inputNumber; i++) {
            while(inputNumber%i == 0) {
                System.out.println(i+" ");
                inputNumber = inputNumber/i;
            }
        }
        if(inputNumber >2) {
            System.out.println(inputNumber);
        }
    }
}

