package Sorting;
/*
Selection sort in descending order
Description
Write a program which sorts the given input array in descending order using selection sort.
*/
import java.util.*;

public class HomeW2 {
    public static void descendingSelectionSort(int arr[], int size) {
        for (int i = 0 ;i< size-1; i++){
            int min = i;
            for (int j = i+1; j< size; j++){
                if (arr[j] > arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0 ;i< size; i++){
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
        descendingSelectionSort(arr, size);
    }
}
