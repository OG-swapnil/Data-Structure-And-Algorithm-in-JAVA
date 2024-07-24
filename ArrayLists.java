import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        //Integer,String,Float,Boolean
        ArrayList<Integer> list= new ArrayList<>();

        //add elements
        list.add(0);
        list.add(5);
        list.add(1);

        System.out.println(list);

        //get element
        int a=list.get(2);
        System.out.println(a);

        //add el in b/w
        list.add(1,9);
        System.out.println(list);

        //set el
        list.set(0,5);
        System.out.println(list);

        //del el
        list.remove(3);
        System.out.println(list);

        //Size
        System.out.println(list.size());

        //sorting
        Collections.sort(list);
        int b=Collections.min(list);
        System.out.println(b);

        


    }
    
}
