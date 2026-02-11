public class Maxavg {
    static double avg(double []n,int k){
        double sum=0;
        double maxsum=0;
        for (int i = 0; i <k; i++) {
            sum+=n[i];
            
        }
        
        maxsum=sum;
        for (int i = k; i < n.length; i++) {
            sum=sum-n[i-k]+n[i];
           maxsum=Math.max(maxsum, sum);
           
            
        }

        return maxsum/k;
    }
    public static void main(String[] args) {
        double []a={1,12,-5,-6,50,3};
        int k=4;
        double l=avg(a,k);
        System.out.println(l);
    }
}
