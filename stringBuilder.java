/**
 * stringBuilder
 */

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'F');
        System.out.println(sb);
        sb.insert(0, 's');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.append('g');
                System.out.println(sb);




        
    }

    
}