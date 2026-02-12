public class Minsub {
    static int longest(int[]a,int target){
        int l=0;
        int r=0;
        int windowsum=0;
        int maxlen=Integer.MAX_VALUE;
        while (r<a.length) {
            windowsum+=a[r];
            while (windowsum>=target) {
                 maxlen=Math.min(maxlen,r-l+1);
                windowsum-=a[l];
                l++;
                
            }
           
            r++;
            
        }
        return maxlen;
    }
public static void main(String[] args) {
    int []a={2,3,1,2,4,3};
    int target=7;
   int res= longest(a,target);
   System.out.println(res);
}
   
       
    }

