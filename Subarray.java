public class Subarray {
    static int subarraymax(int[]p ,int k){
        int sum=0;
        int maxsum=0;
        for (int i = 0; i < k; i++) {
            sum+=p[i];
        }
        System.out.println(sum);
        maxsum=sum;
        
       
        for (int i = k; i < p.length; i++) {
            sum=sum-p[i-k]+p[i];
            maxsum=Math.max(maxsum, sum);
            System.out.println(maxsum);
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int []a={1,2,6,8,9,12};
        int k=3;
        int result=subarraymax(a,k);
        System.out.println(result);
    }
    
}
