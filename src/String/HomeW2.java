package String;
/*Kth non-repeating character*/
import java.util.*;

public class HomeW2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        kthNonRepeatingCharacter(str, k);
    }

    // Method to find the kth non-repeating character in the string
    static void kthNonRepeatingCharacter(String str, int k) {
        int INT_MAX = Integer.MAX_VALUE;
        int n = str.length();
        int[] frequency = new int[256];
        int[] index = new int[256];
        // Initialise counts of all characters to 0 and indices of all characters to INT_MAX.
        for (int i = 0; i < 256; i++) {
            frequency[i] = 0;
            index[i] = INT_MAX;
        }
        char c = '0';
        for (int i = 0; i < n; i++) {
            // Increment frequency of the current character
            c = str.charAt(i);
            frequency[c]++;
            // If this is first occurrence, then store i in index[c].
            if (frequency[c] == 1)
                index[c] = i;
                // If character is already occurred, then remove it from index[]
            else if (frequency[c] > 1)
                index[c] = INT_MAX;
        }
        //This step takes O(1) time as size of index array is 256 i.e constant.
        Arrays.sort(index);
        // If the value at index[k-1] is less than INT_MAX, then return the cha, else return -1.
        if (index[k - 1] < INT_MAX)
            System.out.println(str.charAt(index[k - 1]));
        else {
            System.out.println("NA");
        }
    }
}
