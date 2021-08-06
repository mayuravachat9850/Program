package Sorting;
/*
Bubble Sort - Array Indices
*/
import java.util.Scanner;
public class CodeQ3 {
    public  static void printIndex(int[] arr) {
        final int size = arr.length;

        final int[] result = new int[size];
        for (int i = 0; i < size; i++)
            result[i] = i;

        boolean sorted;
        do {
            sorted = true;
            int bubble = result[0];
            for (int i = 0; i < size - 1; i++) {
                if (arr[bubble] > arr[result[i + 1]]) {
                    result[i] = result[i + 1];
                    result[i + 1] = bubble;
                    sorted = false;
                } else {
                    bubble = result[i + 1];
                }
            }
        } while (!sorted);

        for(int k = 0;k < result.length; k++)
            System.out.print(result[k]+" ");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = scanner.nextInt();
        }
        printIndex(array);
    }
}
