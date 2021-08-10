package Stack;
/*
Sort the stack
*/
import java.util.*;

public class Code3 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }
    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        System.out.println("=============== debug logs ================");
        while(!stack.isEmpty()) {
            int tmp = stack.pop();
            System.out.println("Element taken out: "+tmp);
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                stack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
            System.out.println("input: "+stack);
            System.out.println("tmpStack: "+tmpStack);
        }
        System.out.println("=============== debug logs ended ================");
        //System.out.println(tmpStack);
    }
}
