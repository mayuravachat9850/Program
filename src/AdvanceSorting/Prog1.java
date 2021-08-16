package AdvanceSorting;
/*Quick Sort*/
import java.util.*;

public class Prog1 {
    public static void quickSort(int[] arr, int start, int end) {
        // Termination condition
        if (start >= end) {
            return;
        }
        int pivotIndex = pivot(arr, start, end);

        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    private static int pivot(int[] arr, int start, int end) {

        int pivot = arr[end];// You can choose this pivotElememt as any index value initially
        int i = (start-1);

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
