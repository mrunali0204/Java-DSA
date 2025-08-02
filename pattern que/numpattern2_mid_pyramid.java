/*   1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 */ 

/* 
import java.util.Scanner;

public class numpattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        for (int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
*/

/* 
       1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5
*/
/* 
 import java.util.Scanner;

 public class numpattern {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int rows = sc.nextInt();
 
         for (int i = 1; i <= rows; i++) {
             // Print spaces for alignment
             for (int j = 1; j <= rows - i; j++) {
                 System.out.print(" ");
             }
             // Print numbers
             for (int j = 1; j <= i; j++) {
                 System.out.print(i + " ");
             }
             System.out.println();
         }
     }
 }
*/

import java.util.Scanner;
public class numpattern2_mid_pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int rows = sc.nextInt();
 
         for (int i = 1; i <= rows; i++) {
             // Print spaces for alignment
             for (int j = 1; j <= rows - i; j++) {
                 System.out.print(" ");
             }
             // Print numbers
             for (int j = 1; j <= i; j++) {
                 System.out.print(i + " ");
             }
             System.out.println();
        }
    }
}




