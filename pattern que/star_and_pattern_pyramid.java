/* 
   & - 1 row , i*2-1= i*1
  &*& - 2
 &*&*& - 3
&*&*&*& - 4 
 spaces -> row-i
 & print -> from j=1 to i in -> odd 
 * print -> for j%2==0 in j loop position
For a given row i:
Row 1: 1 symbol → 1 = (1 * 2) - 1
Row 2: 3 symbols → 3 = (2 * 2) - 1
Row 3: 5 symbols → 5 = (3 * 2) - 1
Row 4: 7 symbols → 7 = (4 * 2) - 1
*/

public class star_and_pattern_pyramid {
    public static void main(String[] args) {
        int row = 4;

        for (int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i*2 -1; j++){     //i*2 -1 is king , its like (i*2)-1 = twice times of i and - 1 
                if(j%2==1){
                    System.out.print("&");
                }
                else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
