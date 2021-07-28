package Mathematical;

import java.util.Scanner;

class leap{
    public static boolean isLeapYear(int year) {
        if(((year % 4 == 0) && (year % 100 != 0)) || (year / 400 == 0))
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = isLeapYear(num);
        System.out.println(answer);
    }
}
