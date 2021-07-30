package Array;

import java.util.*;
/*
* Write a Java program that takes the size of an array and the array as input and
 prints the duplicates elements in that array.
 */
public class CodeQ2 {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        printDuplicates(arr);
    }
    static void printDuplicates(int arr[]) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] == arr[k] && j != k && j < k && count <= 1) {
                    //count++;
                    //if (count == 1)
                        //System.out.println(arr[j]);
                    count++;

                }
            }
            if(count==1)
                System.out.println(arr[j]);
            count = 0;
        }
    }
}