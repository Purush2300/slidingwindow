public class Subarraycondition {
    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int k=12;
        int l=0;int r=0;
        int sum=0;int maxlen=0;
        while (r<a.length) {
            sum+=a[r];
            while (sum>k) {
                sum=sum-a[l];
                l++;
                
            }
            if (sum==k) {
                
                
            }
            r++;
            
        }
        System.out.println(maxlen);
    }
    
}
