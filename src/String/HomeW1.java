package String;
/*Remove characters*/
import java.util.*;
public class HomeW1 {
    static String removeCommonChar(String str1, String str2)
    {
        final int NO_OF_CHARS = 256;
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str2.length(); i++)
            count[str2.charAt(i)]++;
        //int count[] = getCharCountArray(str2);
        int ip_ind = 0, res_ind = 0;

        char arr[] = str1.toCharArray();

        while (ip_ind != arr.length)
        {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }

        str1 = new String(arr);

        /* After above step string is ngring.
        Removing extra "iittg" after string*/

        return str1.substring(0, res_ind);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(removeCommonChar(str1, str2));
    }
}
