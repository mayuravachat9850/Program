package Recursion;

import java.util.Scanner;

class CodingQ1{
    public static int sum(int n) {
        int addition = 0;
        addition = n % 10;
        if(n == 0){
            return 0;
        }else{
            return addition + sum(n/10);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        CodingQ1 sc = new CodingQ1();
        System.out.println(sc.sum(n));
    }
}
