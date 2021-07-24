package Home_Encapsulation;

public class Encapsulation_Source {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("add: " + CalcUtil.add(a, b));
        System.out.println("sub: " + CalcUtil.sub(a, b));
        System.out.println("mul: " + CalcUtil.mul(a, b));
        System.out.println("div: " + CalcUtil.div(a, b));
    }
}
