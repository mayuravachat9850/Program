package Array;

import java.util.*;
/*
* Write a Java program that takes the size of an array along with the numbers stored inside the array as inputs
and prints the first non-repeating element in the array.
*/
public class CodeQ1 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = firstNonRepeating(arr);
        if (answer != 0)
            System.out.print(answer);
        else
            System.out.print("All elements are repeated");
    }
    static int firstNonRepeating(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n) {
                    System.out.println("First non-repeating element is: " + arr[i]);
                    return arr[i];
                }
                if (j != i && arr[i] == arr[j]) {
                    break;
                }
            }
        }
        System.out.println("All the elements are repeating.");
        return 0;
    }
}