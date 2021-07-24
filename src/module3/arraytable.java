package module3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arraytable {
    public static void main(String args[]) {
        int[][] table = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 20},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
                {3, 6, 9, 12, 15, 18, 21, 24, 27, 30},
        };
        for (int i = 0; i < table.length; ++i) {
            for(int j = 0; j < table[i].length; ++j) {
                if(table[i][j] > 20)
                    System.out.println(table[i][j]);
            }
        }
    }
}
