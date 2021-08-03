package Sorting;
/*
Selection Sort - State of Array
Description
Consider you have an array of natural numbers of size x. You also have an integer variable “i”.
Write the Selection Sort algorithm for the given array in such a way that the state of the array after “i”
 gets printed.
Input Format:
Size of the array (x)
x elements of the array
A non-negative integer representing the value of i
Output Format:
Print the state of the array after “i” iterations
Sample Input 1:
5
7 1 8 3 4
2
Sample Output 1:
1 3 8 7 4
Explanation 1:
After after first iteration of selection sort: 1 7 8 3 4
Array after second iteration of selection sort: 1 3 8 7 4
Thus, the output gets printed accordingly as you have i=2.
Sample Input 2:
7
9 8 7 6 5 4 3
1
Sample Output 2:
3 8 7 6 5 4 9
Explanation 2:
Array after first iteration of selection sort: 3 8 7 6 5 4 9
Thus, the output gets printed accordingly as you have i=1.
Important Note:
If i = 0, then print the original array.
*/
import java.util.Scanner;

class CodeQ1{
    public static void selectionSortAfterNIterations(int[] arr , int n) {
        int size = arr.length;
        int minimum;
        // reduces the effective size of the array by one in  each iteration.
        for(int i = 0; i < size-1 ; i++) {
            // assuming the first element to be the minimum of the unsorted array .
            minimum = i;
            // gives the effective size of the unsorted  array .
            for (int j = i+1 ; j < size; j++) {
                if (arr[j] < arr[minimum]) {                //finds the minimum element
                    minimum = j;
                }
            }
            if (i <= n-1){
                int temp = arr[minimum];
                arr[minimum] = arr[i];
                arr[i] = temp;
            }
        }
        int no = arr.length;
        for (int i=0; i < no; i++) {
            System.out.print(arr[i] + " ");
        }
        /*
    public static void selectionSortAfterNIterations(int[] arr , int n) {
        if (n!=0) {
            int iterations = 0;
            for(int i=0; i<arr.length; i++) {
                int min = i;
            	for(int j=i+1; j<arr.length; j++) {
            		if(arr[j] < arr[min]) {
            			min = j;
            		}
            	}
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                iterations++;
                if(iterations == n) {
        			break;
    	        }
    	    }
        }
    	for(int k=0; k<arr.length; k++) {
    	   System.out.print(arr[k] + " ");
    	}
*/
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = scanner.nextInt();
        }
        int i = scanner.nextInt();
        selectionSortAfterNIterations(array, i);
    }
}
