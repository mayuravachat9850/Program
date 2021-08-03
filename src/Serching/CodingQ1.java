package Serching;

import java.util.*;

class CodingQ1 {
    public static int getComparisons(int[] inputArr, int key) {
        int n = inputArr.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (inputArr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(getComparisons(array, key));
    }
}
