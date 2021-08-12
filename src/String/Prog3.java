package String;
/* Find First Repeated Char */
import java.util.*;

class Prog3 {
    private static int findFirstRepeatedChar(String str){
        // this is O(N^2) method
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!charSet.add(c)){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = findFirstRepeatedChar(str);
        if(index != -1){
            System.out.println(str.charAt(index));
        }
        else{
            System.out.println("NA");
        }
    }
}