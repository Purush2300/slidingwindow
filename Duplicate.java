import java.util.HashSet; // Import the HashSet class


public class Duplicate {
    static boolean dup(int[]a){
          HashSet<Integer> set = new HashSet<Integer>();
for (int i = 0; i < a.length; i++) {
  
            
                if(set.contains(a[i])){
                    return true;
                 }
                 set.add(a[i]);
           
        }
 return false;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,1};
        boolean c=dup(a);
        System.out.println(c);
    }
}
