class Node {
    int data;
    Node next;
    Node(int d){ data=d; }
}
public class LinkedListSearch {
    static boolean search(Node head,int key){
        while(head!=null){
            if(head.data==key) return true;
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        System.out.println(search(head,2));
    }
}