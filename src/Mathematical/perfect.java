package Mathematical;

import java.util.Scanner;

class perfect{
    public static int perfectNumber(int num) {
        int sum = 1;

        // Find all divisors and add them
        for (int i = 2; i * i <= num; i++) {
            if (num % i==0) {
                if(i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = perfectNumber(num);
        System.out.println("++++++++++++++ "+ answer);
        boolean isPerfectNumber = false;
        if (answer == 1)
            isPerfectNumber = true;
        System.out.println(isPerfectNumber);
    }
}
