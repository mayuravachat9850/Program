package module4.BitManipulation.Code2;

import java.util.Scanner;

class Code1{
    public static int numberOfSetBits(int num) {
        int setBits = 0;
        while (num > 0) {
            setBits += num & 1;
            num >>= 1;
        }
        return setBits;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = numberOfSetBits(num);
        System.out.println(count);
    }
}

