class Node {
    int data;
    Node next;
    Node(int d){ data=d; }
}
public class SinglyLinkedList {
    Node head;

    void insert(int x){
        Node n=new Node(x);
        n.next=head;
        head=n;
    }

    void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList l=new SinglyLinkedList();
        l.insert(10);
        l.insert(20);
        l.display();
    }
}