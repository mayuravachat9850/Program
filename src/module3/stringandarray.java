package module3;

import java.util.Scanner;

public class stringandarray {
    public static void main(String[] args){
        String[] nameList = new String[10];
        nameList[0] = "Howard";
        nameList[1] = "Sheldon";
        nameList[2] = "Penny";
        nameList[3] = "Amy";
        String leadCharacter= nameList[1];
        int len = leadCharacter.length();
        System.out.println(len);
    }
}
