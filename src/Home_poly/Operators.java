package Home_poly;

public class Operators implements Operator {
    public static final Operator ADDITION = (a, b) -> a+b;
    public static final Operator SUBTRACTION = (a, b) -> a-b;
    public static final Operator MULTIPLICATION = (a, b) -> a*b;;
    public static final Operator DIVISION = (a, b) -> a/b;;

    @Override
    public int operate(int a, int b) {
        return 0;
    }
}
