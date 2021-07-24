package module3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i>=1;i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
