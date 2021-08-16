package AdvanceSorting;
/*Merge Sort*/
import java.io.*;
import java.util.*;
public class Prog2 {
    public static void mergeSort(int[] arr , int start , int end) {
        //Termination condition
        if(start>=end) {
            return ;
        }
        int mid = start + (end-start)/2 ;

        mergeSort(arr, start ,mid);
        mergeSort(arr, mid+1 , end);

        merge(arr,start , mid+1 ,end);
    }

    public static void merge(int[] arr , int start, int mid , int end) {
        //It means there are 1 or less elements
        if(start>=end) {
            return ;
        }
        int left = start ;
        int right =mid ;
        int index=left;
        int[] temp = new int[arr.length];

        while(left <mid && right <=end) {

            if(arr[left]<=arr[right]) {
                temp[index++]=arr[left++];
            }else {
                temp[index++]=arr[right++];
            }
        }

        while(left<mid) {
            temp[index++] = arr[left++];
        }

        while(right<=end) {
            temp[index++]=arr[right++];
        }

        for(int i=start;i<=end;i++) {
            arr[i]=temp[i];
        }
    }

    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
