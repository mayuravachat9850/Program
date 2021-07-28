package Home_Inheritance.CodingQ2;

class Demo {
    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }


    public static void main(String[] args) {
        Demo obj = new Demo();
        int x = 3;
        int n= 3;
        System.out.print(obj.func(x,n));
    }
}
