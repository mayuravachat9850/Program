package Recursion;

import java.util.*;

public class CodingQ4 {
    // Method to reverse the digits of an integer
    static void reverseInteger(int n) {
        int revNo = 0,rem;
        while(n != 0){
            rem = n%10;
            revNo = revNo * 10 +rem;
            n /= 10;
        }
        System.out.print(revNo);
        return;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseInteger(n);
    }
}