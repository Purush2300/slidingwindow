public class Subarray {
    static int subarraymax(int[]p ,int k){
        int sum=0;
        int maxsum=0;
        for (int i = 0; i < k; i++) {
            sum+=p[i];
        }
        maxsum=sum;
        for (int i = 1; i <= p.length-k; i++) {
            sum=sum-p[i-1]+p[i+1];
            if(sum<maxsum){
                maxsum=sum;
            }
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int []a={1,5,6,7,8,-8,-2,-5};
        int k=4;
        int result=subarraymax(a,k);
        System.out.println(result);
    }
    
}
