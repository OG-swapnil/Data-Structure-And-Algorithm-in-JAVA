import java.util.*;
public class Recursion {
    // public static int factorial(int n){
    //     if (n==1 || n==0){
    //         return 1;
    //     }
    //     int fact=factorial(n-1);
    //     int a=n*fact;
    //     return a;
    // }
    public static int fib(int n){
        if(n==0){
            return 0;
        }else if (n==1) {
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int b= fib(n);
        System.out.println(b);
    }
    
}
