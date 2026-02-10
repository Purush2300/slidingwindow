public class Subarray {
    static int subarraymax(int[]p ,int k){
        int sum=0;
        int maxsum=0;
        for (int i = 0; i < k; i++) {
            sum+=p[i];
        }
        maxsum=sum;
       
        for (int i = k; i < p.length; i++) {
            sum=sum-p[i-k]+p[i];
            // if(sum>maxsum){
            //     maxsum=sum;
            // }
            maxsum=Math.max(maxsum, sum);
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int []a={6,2,3,4,7,2,1,7,1};
        int k=4;
        int result=subarraymax(a,k);
        System.out.println(result);
    }
    
}
