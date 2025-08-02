import java.util.Scanner;

public class SubFun {
    public static int sub_fun(int a , int b) {
        int sub=a-b;
        return sub;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sub = sub_fun(a,b);
        System.out.println(sub);

    }
}

    
