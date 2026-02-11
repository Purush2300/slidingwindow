public class Minsub {

    static int minim(int[]y,int x){
        int sum=0;
        int l =0;
        
        int lenght1=0;
       
        for (int r = 0; r < y.length; r++) {

            
            sum+=y[r];
            
            if (sum>=x) {
                lenght1= r+1;
                // lenght1=Math.max(lenght1, currentlen);
                // sum=sum-y[l];
               
            }
            
        }
        return lenght1;
        }
    
    public static void main(String[] args) {
        int[]a={2,4,6,8,9,1,2,5,4,3,2,7,8,9,1,3,2,5,7,8};
        int k=7;
       int w= minim(a,k);
       System.out.println(w);
    }}

