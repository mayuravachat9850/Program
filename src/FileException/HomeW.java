package FileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;

public class HomeW {
    public static List<String> getRedZoneCities(String fileName) throws IOException,NullPointerException {
        /*
         * TODO: Read the city data from the city_data.txt file and return the cities
         * which have more than 2,000 covid19 cases
         */

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            HashMap credentials = new HashMap<>();
            String line;
            while ((line=br.readLine()) != null) {
                String[] tokens = line.split(",");
                credentials.put(tokens[0], tokens[1]);
                //System.out.println(tokens[1]);
                int pop = (int) credentials.get(tokens[1]);

                if(pop < 2000){
                    System.out.println(tokens[0]);
                }
            }
        return Collections.singletonList(line);

    }

    public static void main(String args[]) throws IOException {
        String fileName;
        if(args != null && args.length != 0) {
            fileName = args[0];
        } else {
            fileName = "C:/Users/lenovo/Desktop/city.txt";
            //uncomment below line and comment above line for testing sample test case 2
            //fileName = "/code/workspace/city_data2.txt";
        }
        List<String> rezZoneCities = getRedZoneCities(fileName);
        System.out.print(rezZoneCities);
    }
}
