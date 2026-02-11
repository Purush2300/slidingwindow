public class Demo {
    static double avgsum(int[] x,int y){
        int sum=0;
        int msum=0;
        
        for (int i = 0; i <y; i++) {
            sum+=x[i];
        }
        msum=sum;
        for (int i = y; i < x.length; i++) {
            sum=sum-x[i-y]+x[i];
            msum=Math.max(msum, sum);
        }
        System.out.println(msum);
        return (double) msum/y;

        
    }
    public static void main(String[] args) {
       int []a={1,3,2,4};
       int k=2;
       double result=avgsum(a, k);
       System.out.println(result);
    }
    
}
