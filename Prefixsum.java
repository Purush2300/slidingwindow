public class Prefixsum {
    public static void main(String[] args) {
        int []n={1,2,3,4};
        int z=n.length;
        int []k=new int [z];
        k[0]=n[0];
        for (int i = 1; i < n.length; i++) {
            k[i]=k[i-1]+n[i];
           
            
        }
      for (int i = 0; i < k.length; i++) {
        System.out.println(k[i]);
      }
    }
}
