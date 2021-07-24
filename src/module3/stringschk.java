package module3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringschk {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Admin String:: ");
        String admin = sc.next();
        System.out.println("Enter the Input String:: ");
        String input = sc.next();
        if (admin.equals(input)) {
            System.out.println("Welcome Admin");
        } else if(input == null){
            System.out.println("Access Denied");
        }else if(admin != input) {
            System.out.println("Access Denied");
        }
    }
        // TODO: Display the whether the user is the admin or the access is denied.
}

