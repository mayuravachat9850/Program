package Sorting;
/*
Write a program in Java that can return an array in descending order of elements using Insertion Sort.
*/
import java.util.Scanner;

class CodeQ2 {
    public static void insertionSortDescending(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (array[i] < array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSortDescending(array);
    }
}
