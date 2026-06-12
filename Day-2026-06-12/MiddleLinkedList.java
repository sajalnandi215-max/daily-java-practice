public class MiddleLinkedList {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 public static void main(String[] args){
  Node h=new Node(1);
  h.n=new Node(2); h.n.n=new Node(3); h.n.n.n=new Node(4);
  Node s=h,f=h;
  while(f!=null && f.n!=null){s=s.n; f=f.n.n;}
  System.out.println(s.d);
 }
}