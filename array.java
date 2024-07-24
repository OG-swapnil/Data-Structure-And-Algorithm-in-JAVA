import java.util.*;

public class array {

    public static void main(String[] args) {
        // predefined array---->
        // int mar[] = new int[4];
        // mar[0] = 76;
        // mar[1] = 96;
        // mar[2] = 86;
        // mar[3] = 46;
        // for (int i = 0; i < 4; i++) {
        // System.out.println(mar[i]);
        // }
        // int mar[] = { 19, 16, 17, 17 };
        // for (int i = 0; i < mar.length; i++) {
        // System.out.println(mar[i]);
        // }
        // userdefined/user inputed array---->
        @SuppressWarnings("resource")
        Scanner n = new Scanner(System.in);
        int a[] = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = n.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}