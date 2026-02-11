public class FirstLast {
    static int maxsum(int []n,int k){
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        for (int i = 0; i <= k-1; i++) {
            lsum+=n[i];
        }
       maxSum=lsum;
       int rindex=n.length-1;
       for (int i = k-1; i >=0; i--) {
            lsum=lsum-n[i];
            rsum+=n[rindex];
            rindex--;
            maxSum=Math.max(maxSum, lsum+rsum);
       }
       return maxSum;
    }
    public static void main(String[] args) {
        int []a={5, 4, 1, 8, 7, 1, 3};
        int k=3;
        int s=maxsum(a,k);
        System.out.println(s);
    }
}
