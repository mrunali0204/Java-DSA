/*      *
       **
      ***
     ****
    *****
 */
/* 
public class leftstar {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}
*/


/*      *
       **
      ***
     ****
    *****
 */
/* 
 public class leftstar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    */

public class leftstar {
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}