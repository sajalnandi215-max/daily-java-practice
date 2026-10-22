class Node {
    int data;
    Node next;
    Node(int d){ data=d; }
}
public class StackLinkedList {
    Node top;

    void push(int x){
        Node n=new Node(x);
        n.next=top;
        top=n;
    }

    int pop(){
        if(top==null) return -1;
        int x=top.data;
        top=top.next;
        return x;
    }

    public static void main(String[] args){
        StackLinkedList s=new StackLinkedList();
        s.push(5);
        s.push(15);
        System.out.println(s.pop());
    }
}