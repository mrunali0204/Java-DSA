

public class marks{
    public static void main(String args[]){
        int mark[] = new int[3];    //array formation with size
        mark[0] = 97;
        mark[1] = 98;
        mark[2] = 95;
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        //or
        for(int i=0; i<=3; i++){
            System.out.println(mark[i]);
        }
    }
}