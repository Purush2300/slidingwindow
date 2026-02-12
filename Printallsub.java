public class Printallsub {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        // for (int i = 1; i < a.length; i++) {
            
        //     for (int j = 0; j < a.length-i+1; j++) {
        //         for (int j2 = j; j2 <j+i; j2++) {
        //             System.out.print(a[j2]+" ");
        //         }
        //         System.out.println();
        //         // System.out.println();
        //         // sum+=a[j];
        //         // if(sum%2==0){
        //         //     System.out.print(sum+" ");
        //         // }
                
                
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= a.length; i++) {
            System.out.println(i+"subarrays are");
            for (int j = 0; j < a.length-i+1; j++) {
                for (int j2 = j; j2 <j+i; j2++) {
                    System.out.print(a[j2]+" ");
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }
}
