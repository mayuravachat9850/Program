package module3;

public class test {
    public static void main(String... args) {
        int s1=0;
        int s2=17;
        int i,j,k;
        int firstRow=-1;
        for(i=4;i>0;i--){
            for(j=0;j<i;j++){
                if(j>0)
                    System.out.print("*"+ ++s1);
                else
                    System.out.print(" "+ ++s1);
            }
            for(k=0;k<i;k++){
                if(k==0){
                    if(i==4)
                        firstRow =s2;
                    else{

                        firstRow =firstRow-i-i-1;
                    }
                }
                System.out.print("*"+ firstRow++);
            }
            System.out.println();
        }
    }
}
/*outPut
        1*2*3*4*17*18*19*20
        5*6*7*14*15*16
        8*9*12*13
        10*11*/
