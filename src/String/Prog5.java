package String;

/*Compare for Unique Characters*/

import java.util.*;
public class Prog5 {
    static String removeChars(String str, String secStr) {
        int countArr[] = getCharCount(secStr);
        int inputInd = 0, resInd = 0;
        char arr[] = str.toCharArray();
        while (inputInd < arr.length) {
            char temp = arr[inputInd];
            if (countArr[temp] == 0) {
                arr[resInd] = arr[inputInd];
                resInd++;
            }
            inputInd++;
        }
        str = new String(arr);
        return str.substring(0, resInd);
    }

    static int[] getCharCount(String str) {
        int count[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2=str2.toLowerCase();
        int length1 = str1.length();
        int length2 = str2.length();
        if (str1.equals(str2))
            System.out.print("same");
        if (length1 >= length2)
            System.out.println(removeChars(str1,str2));
        else
            System.out.print("NA");
    }
}

