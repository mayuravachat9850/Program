package String;
/*Reverse the String using recursion*/
import java.util.*;
public class Prog1 {
    public static String reverse(String str) {
        //checks if the string is empty
        if(str.isEmpty()) {
            //System.out.println("String is empty.");
            //if the above condition is true returns the same string
            return str;
        } else {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}