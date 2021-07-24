package module3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Write a program to search a number in the array given below.
numberArray = {1,15,90,40,35,63,79,88,20};*/

public class Source {
    public static void main(String args[] ) throws Exception {
        int n, x;
        int[] numberArray = {1,15,90,40,35,63,79,88,20};
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        x = numberArray.length;
        int flag=0,i=0;
        for(i = 0; i < x; i++)
        {
            if(numberArray[i] == n)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println((i + 1));
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}
