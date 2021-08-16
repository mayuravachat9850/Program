public class test {
    public static void main(String args[]){
        int A[] = {1,3,5,7};
        int B[] = {2,3,5,7};

        for (int i=0;i<A.length;i++){
            int count = 0;
            for (int j=0;j<B.length;j++) {
                if (A[i] == B[j])
                    count++;
            }
            if(count == 0)
                System.out.print(A[i]+" ");
        }
    }
}
