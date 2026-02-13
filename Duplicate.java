public class Duplicate {
    static void dup(int[]a){
for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if(a[i]==a[j]){
                    System.out.println("true");
                    break;
                    
                }
               else{
                System.out.println("false");
                break;
               }
            }
           
        }
 
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,1};
        dup(a);
       
    }
}
