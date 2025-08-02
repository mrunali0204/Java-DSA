import java.util.Scanner;

public class multi_fun {

    public static int multiply_fun(int a, int b) {
        int multiply = a*b;
        return multiply;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiply = multiply_fun(a, b);
        System.out.println(multiply);
    }
}
