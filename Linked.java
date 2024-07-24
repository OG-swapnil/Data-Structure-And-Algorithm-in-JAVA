public class Linked {
    static class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void AddFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head=newNode;
    }
    public static void AddLast(String data){
        Node newNode = new Node(data);
        Node curr = head;
        while (curr!=null){
            if (curr.next==null){
                curr.next=newNode;
                newNode.next=null;
            }
            curr=curr.next;
        }
    }
        
    public static void Print(Linked list){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Linked list = new Linked();
        AddFirst("You");
        AddFirst("how");
        AddLast("Doin");
        Print(list);
        
    }

    
}
