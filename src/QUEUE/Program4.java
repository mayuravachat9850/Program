package QUEUE;
/*Method to sort the queue*/
import java.util.*;

public class Program4 {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        int n = queue.size();
        for (int i = 0; i < n; i++) {
            // Find the index of smallest element from the unsorted queue
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int currValue = queue.poll();
                // Find the minimum value index only from unsorted queue
                if (currValue < minValue && j < (n - i)) {
                    minValue = currValue;
                    minIndex = j;
                }
                queue.add(currValue);
            }
            // Remove min value from queue
            for (int j = 0; j < n; j++) {
                int currValue = queue.poll();
                if (j != minIndex) {
                    queue.add(currValue);
                }
            }
            // Add min value to the end of the queue
            queue.add(minValue);
        }
        // Print the sorted queue
        System.out.print(queue);
    }
}