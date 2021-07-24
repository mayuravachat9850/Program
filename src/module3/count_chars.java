package module3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class count_chars {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        char word = s.next().charAt(0);
        int cnt = 0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i) == word)
                cnt++;
            }
        System.out.println(cnt);
            // TODO: Display number of times the character appears.
    }
}

