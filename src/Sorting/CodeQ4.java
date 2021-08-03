package Sorting;

/*
Write a Bubble Sort program that sorts the given input array in descending order
and prints the number of swaps made after m passes in the algorithm.
*/

import java.util.Scanner;

class CodeQ4 {
    static int totalBubbleSortSwaps(int[] array, int m) {
        int pass=0;
        boolean isDone;
        for (int k = 0; k < ( array.length-1 ); k++) {
            isDone=true;
            for (int j = 0; j < array.length-k-1; j++) {
                if (array[j] < array[j+1])
                {
                    //isDone=false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    pass++;
                }
            }
            if(isDone){
                break;
            }

        }
        //for (pass =1; pass <m; ++pass){
        //for (k = 0; k < size; k++)
        return pass;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(array, m));
    }
}