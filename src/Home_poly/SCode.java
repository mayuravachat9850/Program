package Home_poly;

public class SCode {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        char operatorChar = '/';

        Operator operator = null;
        switch (operatorChar) {
            case '+': operator = Operators.ADDITION; break;
            case '-': operator = Operators.SUBTRACTION; break;
            case '*': operator = Operators.MULTIPLICATION; break;
            case '/': operator = Operators.DIVISION; break;
        }
        System.out.println(operator.operate(a, b));
    }
}
