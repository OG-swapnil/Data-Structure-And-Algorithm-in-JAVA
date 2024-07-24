import java.util.*;

public class QueueClass {
    /*2 ways to implement Queue
     * 1-->using LinkedList()===>Queue<Integer> q = new LinkedList<>();
     * 2-->Using ArrayDeQue()===>Queue<Integer> q = new ArrayDeque<>();
     */
   public static void main(String[] args) {
        Queue<Integer> Q = new ArrayDeque<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);

        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
            
        }
   }

}
