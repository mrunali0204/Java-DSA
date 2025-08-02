/*
         1           -> i=1 ; j=1 ; 
       1 2 1         -> i=2; j=1,2,3
     1 2 3 2 1       -> i=3; j=1,2,3,4,5
   1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1
 */
public class numpatten7 {
    public static void main(String [] args){
        int row = 5;
        for(int i=1; i<=row ; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }                                            
} 
