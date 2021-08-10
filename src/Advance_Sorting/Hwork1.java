package Advance_Sorting;
/*
Alternative Sorting
Description
Sort an array such that the first element is largest and then the smallest element.
It has to be followed by second largest and second smallest element in array.
Input Format:
Size of the array
Elements of the array
Output Format:
Alternating sorted array
Sample Input 1:
6
6 1 4 2 9 3
Sample Output 1:
9 1 6 2 4 3
Explanation 1:
The largest element is 9 and the smallest element is 1.
So first we have the largest element and then the smallest element. Next in the array,
we have the second largest element and the second smallest element.
*/
import java.io.*;
import java.util.*;
public class Hwork1 {
    public static void alternativeSorting(int[] arr) {
        int size = arr.length;
        Arrays.sort(arr);

        // Printing the last element of array
        // first and then first element and then
        // second last element and then second
        // element and so on.
        int i = 0, j = size-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }

        // If the total element in array is odd
        // then print the last middle element.
        if (size % 2 != 0)
            System.out.print(arr[i]);
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
