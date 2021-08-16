package AdvanceSorting;
/*Alternative Sorting*/
import java.io.*;
import java.util.*;
public class HomeW1 {
    public static void alternativeSorting(int[] arr) {
        int x=arr.length;
        for(int i=1;i<x;i++){
            int pivot=arr[i];
            int j=i-1;
            while(j>=0 && pivot<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=pivot;
        }
        int start=0,end=x-1;
        int[] arr2 = new int[x];
        for(int i=0;i<x;i++){
            arr2[i]=arr[end--];
            i++;
            arr2[i]=arr[start++];
        }
        for(int i=0;i<x;i++){
            arr[i]=arr2[i];
        }

    }

    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        alternativeSorting(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}