package Mathematical;

import java.util.Scanner;

class Factorial{
    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++)
            result *= i;
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = factorial(num);
        System.out.println(answer);
    }
}
