import java.util.Scanner;

public class divi_fun {
    public static int divide_fun(int a, int b){
        int divide = a/b;
        return divide;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int divide = divide_fun(a,b);
        System.out.println(divide);
    }

}
