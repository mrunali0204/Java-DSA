/*
     ****
    *  *
   *  *
  **** 
 */
public class hollow_rhombus {
    public static void main(String[] args) {
        int row = 4;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
                
            }
            for(int j=1; j<=row; j++){
                
                if(i==2 & j==2 || i==2 & j==3 || i==3 & j==2 || i==3 & j==3){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
