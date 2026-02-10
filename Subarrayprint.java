public class Subarrayprint {
    public static void main(String[] args) {
        int []a={1,5,7};
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                // for (int j2 = i; j2 <=j; j2++) {
                //     System.out.print(a[i]+a[j]);
                    
                // }
                sum+=a[j];
                 System.out.println(sum);
                
            }
           
            
            
        }
    }
}
