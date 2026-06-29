public class ReverseLinkedList {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 static Node reverse(Node h){
  Node p=null,c=h,n;
  while(c!=null){
   n=c.n; c.n=p; p=c; c=n;
  }
  return p;
 }
 public static void main(String[] args){
  Node h=new Node(1);
  h.n=new Node(2); h.n.n=new Node(3);
  h=reverse(h);
  for(Node t=h;t!=null;t=t.n) System.out.print(t.d+" ");
 }
}