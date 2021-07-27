package module4.BitManipulation.Code2;

import java.util.Scanner;

class Code2{
    public static int reverseBits(int num) {
        int i = 0;
        while (num > 0)
        {
            //left shift by 1
            i <<= 1;
            // if the current bit is '1' then
            if ((int)(num & 1) == 1)
                i ^= 1;
            // num is shifted right by 1
            num >>= 1;
        }
        return i;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = reverseBits(num);
        System.out.println(answer);
    }
}

