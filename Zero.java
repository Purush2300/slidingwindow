public class Zero {
    static void maxones(int []p,int q){
        int count=0;
        int sum=0;
        int maxcount=0;
        for (int i = 0; i < q; i++) {
           sum+=p[i];
            if(p[i]==1){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
       
        for (int i = 1; i <=p.length-q; i++) {
           sum=sum-p[i-1]+p[i+2];
           if(p[i]==1){
                count++;
            }
            System.out.println(count);

            
        }
       
    }
    public static void main(String[] args) {
        int []a={1,0,1,1,0};
        int k=3;
        maxones(a,k);
    }
}
