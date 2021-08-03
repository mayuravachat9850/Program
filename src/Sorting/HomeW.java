package Sorting;

import java.util.*;
/*
Bubble sort in descending order
Description
Write a program which sorts the given input array in descending order using bubble sort.

Input Format:
----> Size of the array
----> Elements of the array
Output Format:
----> Sorted array in descending order

Sample Input 1:
4
9 1 7 4

Sample Output 1:
9
7
4
1
*/
public class HomeW {
    public static void descendingBubbleSort(int arr[], int size) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        descendingBubbleSort(arr, size);
    }
}
