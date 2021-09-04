package FileIO;

import java.util.*;
import java.util.stream.*;

public class Program1 {
    public static List<String> getMorningTrainTimes(Stream<Integer> stream) {
        /*
         * TODO: Filter all the morning train timings and convert them to the desired
         * format and return the output as a list of string values
         */
        return stream.filter(i -> i < 12).map(i -> i + ":00 AM").collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers;
        numbers = Arrays.asList(1, 3, 7, 8, 10, 12, 13, 15);
        //uncomment below line and comment above line for testing sample test case 2
//      numbers = Arrays.asList(3, 8, 13, 15, 23);
        List<String> morningList = getMorningTrainTimes(numbers.stream());
        System.out.println(morningList);
    }
}
