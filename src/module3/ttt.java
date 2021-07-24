package module3;

public class ttt {
    public static void main(String[] args){
        int i=0;
        for(i=1; i<=8;i++)
        {
            if(i%2==0)
                continue;
            System.out.print(i+",");
        }
    }
}
