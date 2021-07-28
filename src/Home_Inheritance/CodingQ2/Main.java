package Home_Inheritance.CodingQ2;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void weirdSum(int N, int A[]){
// this is default OUTPUT. You can change it.
        int result=-404;

//WRITE YOUR LOGIC HERE:
        int len = A.length;
        //System.out.println(len);
        for(int i = 0; i< len; i++){
            A[i] += A[i];
            //System.out.println(A[i]);
        }
        for(int i=0;i<N;i++) {
            A[i] += A[i];
            System.out.print(A[i]);
        }
    }
    public static void main(String[] args) {
// INPUT [uncomment & modify if required]
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]= new int[N];
        for(int i=0;i<N;i++) {
            A[i]=sc.nextInt();
        }
// OUTPUT [uncomment & modify if required]
        weirdSum(N,A);
        sc.close();
    }
}
