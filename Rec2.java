import java.util.*;
public class Rec2 {
    public static void TOH(int n, String a,String b,String c){
        if (n==1){
            System.out.println("move"+n+"from"+a+"to"+c);
            return;
        }
        TOH (n-1,a,c,b);
        System.out.println("move"+n+"from"+a+"to"+c);
        TOH (n-1,b,a,c);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n,"a","b","c");
    }
}
