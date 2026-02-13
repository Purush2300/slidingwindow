public class Distint {
    static void district(int []a,int k){
        int i=0;
        int j=0;
        int sum=0;
        int msum=0;
        while(j<k){
            sum+=a[j];
            j++;
        }
        while (j<a.length) {
          if(a[i+1]-a[i]==0 || a[j-1]-a[j]==0){
            
          }
            sum+=a[j];
            sum-=a[i];
            msum=Math.max(sum, msum);
            i++;
            j++;
        }
        System.out.println(msum);
    }
    public static void main(String[] args) {
        int []a={1,5,4,2,9,9,9};
        int k=3;
        district(a,k);
    }
}
