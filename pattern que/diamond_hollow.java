/*
        *
       * *
      *   *
     *     *
     *     *
      *   *
       * *
        *
 */
public class diamond_hollow {
    public static void main(String[] args) {
        int row=4;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i==3 & j==2 || i==4 & j==2|| i==4 & j==3){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
        for(int i=row; i>=1; i--){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i==3 & j==2 || i==4 & j==2|| i==4 & j==3){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
    
        }
    }
}