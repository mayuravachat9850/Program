package String;
/*
Write a Java program that takes in a string as input and prints all the possible permutations of that string.
*/
import java.util.*;
public class Prog4 {
    public static void stringPermutations(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else
        {
            for (int i = left; i <= right; i++)
            {
                str = swap(str,left,i);
                stringPermutations(str, left+1, right);
                str = swap(str,left,i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if(len <= 3)
            stringPermutations(str,0,len-1);
        else
            System.out.print("NA");
    }
}
