package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeFile {
    public static List<String> getRedZoneCities(String fileName) {
        /*
         * TODO: Read the city data from the city_data.txt file and return the cities
         * which have more than 2,000 covid19 cases
         */
        List<String> rezZoneCities = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName);) {
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] cityData = line.split(",");
                int cases = Integer.parseInt(cityData[1]);
                if (cases > 2000) {
                    rezZoneCities.add(cityData[0]);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rezZoneCities;
    }

    public static void main(String args[]) {
        String fileName;
        if(args != null && args.length != 0) {
            fileName = args[0];
        } else {
            fileName = "/code/workspace/city_data1.txt";
            //uncomment below line and comment above line for testing sample test case 2
//         fileName = "/code/workspace/city_data2.txt";
        }
        List<String> rezZoneCities = getRedZoneCities(fileName);
        System.out.print(rezZoneCities);
    }
}
