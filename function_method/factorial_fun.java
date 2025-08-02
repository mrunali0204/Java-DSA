// 0, 1, 1, 2, 3, 5, 8  -> fibonacci
// factorial -> n! , n=3 , n = 3*2*1; n!= factorial of n  = n * n-1 * n-2 , 1*2*3 = 3!, n-2* n-1* n-0= n!
                                                                        //       1*2*3*4 = 4!
                                                                                 
import java.util.Scanner;

public class factorial_fun {
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by current number
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
        
    }
}
