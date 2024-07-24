import java.util.*;

public class string {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String Firstname = sc.next(); //if single word so next()

        /*function 
         * ---Concatination
         */
        String Lastname = sc.next();
        String FullName = Firstname +" "+ Lastname;
        System.out.println(FullName);

        /*
         * ---charAt
         */
        // for(int i=0;i<FullName.length();i++){
        //     System.out.println(FullName.charAt(i));
        // }

        /*
         * ---compare
         */
        if (Firstname.compareTo(Lastname)==0) {
            System.out.println("equal");
        }else{
            System.out.println("not equalS");
        }

        /*
         * ---Substring similar to slicing
         * substring(big.index,end.index)
         */
        String name=FullName.substring(8);
        System.out.println(name);

        // Practice
        // String str=sc.next();
        // StringBuilder nstr=new StringBuilder("");
        // for (int i=str.length()-1;i<0;i--){
        //     nstr.append(str.charAt(i));
        // }
        // System.out.println(nstr);
        

    }

}
