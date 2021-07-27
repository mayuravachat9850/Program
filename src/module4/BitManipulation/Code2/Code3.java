package module4.BitManipulation.Code2;

import java.util.Scanner;

class Code3{
    public static int subtractBits(int num1, int num2) {
        while (num2 != 0)
        {
            // we first calculate the borrow
            int borrow = (~num1) & num2;
            // the difference is calculated as
            num1 = num1 ^ num2;
            // Now, borrow is shifted left by one so that subtracting it from
            // num1 gives the required difference
            num2 = borrow << 1;
        }
        return num1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = subtractBits(num1, num2);
        System.out.println(answer);
    }
}