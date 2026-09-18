public class LengthLinkedList {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 static Node head;
 static int length(){
  int c=0; Node t=head;
  while(t!=null){c++; t=t.n;}
  return c;
 }
 public static void main(String[] args){
  head=new Node(1); head.n=new Node(2);
  System.out.println(length());
 }
}