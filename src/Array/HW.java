package Array;

import java.util.*;

/*
* Write a program which calculates the maximum product between the two elements in the given array.
* */

public class HW {
    static int maxProduct(int[] arr) {
        int max_pair_product = Integer.MIN_VALUE;
        int max_i = -1, max_j = -1;

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (max_pair_product < arr[i] * arr[j])
                {
                    max_pair_product = arr[i] * arr[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        return arr[max_i]*arr[max_j];
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = maxProduct(arr);
        System.out.print(answer);
    }
}

