package Mathematical;

import java.util.Scanner;

class Palindrome{
    public static int palindrome(int num) {
        int reverseNo = 0, remainder;
        while (num != 0){
            remainder = num % 10;
            reverseNo = reverseNo * 10 +remainder;
            num /= 10;
        }
        return reverseNo;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = palindrome(num);
        boolean isPalindrome = false;
        if (answer == num)
            isPalindrome = true;
        System.out.println(isPalindrome);
    }
}
