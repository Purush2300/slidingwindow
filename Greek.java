public class Greek {
    static int maxi(int[] n,int k){
        int sum=0;
        int msumm=0;

        for (int i = 0; i <k; i++) {
            sum+=n[i];
            
        }
        msumm=sum;
        for (int i = k; i < n.length; i++) {
            sum=sum-n[i-k]+n[i];
            msumm=Math.max(msumm, sum);
        }
        return msumm;
    }
    public static void main(String[] args) {
        int []a={100,200,300,400};
        int k=2;
        int re=maxi(a,k);
        System.out.println(re);
    }
}
