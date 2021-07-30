package Array;

import java.util.*;
/*
Write a Java program that takes in two sorted arrays without duplicate values (within an array) and
prints the merged array such that the elements in the merged array are sorted and are not repeated.
*/
public class CodeQ3 {

    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++){
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++){
            arr2[i] = s.nextInt();
        }
        mergeSortedArrays(arr1, arr2);
    }
    public static void mergeSortedArrays(int arr1[], int arr2[]) {
        int m = arr1.length ;
        int n = arr2.length ;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while(i < m)
            System.out.print(arr1[i++] + " ");
        while(j < n)
            System.out.print(arr2[j++] + " ");
    }
}
