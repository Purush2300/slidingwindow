public class Greek {
    static void maxi(int[] n,int k){
        int sum=0;
        int msumm=0;
        int stend=0;

        for (int i = 0; i <k; i++) {
            sum+=n[i];
            
        }
        msumm=sum;
        for (int i = k; i < n.length; i++) {
            sum=sum-n[i-k]+n[i];
            if (sum>msumm) {
                msumm=sum;
                 stend=i-k+1;
                
            }}
            for (int j = stend; j < stend+k; j++) {
                System.out.print(n[j]+" ");
            }
        
        
    }
    public static void main(String[] args) {
        int []a={100,200,300,400};
        int k=2;
        maxi(a,k);
        
    }
}
