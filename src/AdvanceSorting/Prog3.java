package AdvanceSorting;
/*Merge Both In Ascending Order*/
import java.util.Scanner;

class Prog3 {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int ascendingMerge[] = mergeBothInAscendingOrder(sortedArray1, sortedArray2);

        for (int i = 0; i < ascendingMerge.length; i++) {
            System.out.println(ascendingMerge[i]);
        }
    }

    private static int[] mergeBothInAscendingOrder(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0, j = 0, k = 0;
        while (i<len1 && j <len2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < len1)
            arr3[k++] = arr1[i++];
        while (j < len2)
            arr3[k++] = arr2[j++];

        return arr3;
    }

    private static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}