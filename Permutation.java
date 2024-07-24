import java.util.Scanner;

public class Permutation {
    public static void Perm(String str,String perm,int idx){
        if (str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i=0;i<str.length();i++){
            char curr= str.charAt(i);
            String newStr= str.substring(0, i) + str.substring(i+1);
            Perm(newStr,perm+curr,idx+1);
        }
    }
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        String perm= "";
        Perm(str,perm,0);
    }
}
