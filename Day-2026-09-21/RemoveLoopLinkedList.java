public class RemoveLoopLinkedList {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 static void removeLoop(Node h){
  Node s=h,f=h;
  do{ s=s.n; f=f.n.n; }while(s!=f);
  s=h;
  while(s.n!=f.n){ s=s.n; f=f.n; }
  f.n=null;
 }
 public static void main(String[] args){
  Node h=new Node(1);
  h.n=new Node(2); h.n.n=new Node(3);
  h.n.n.n=h.n;
  removeLoop(h);
  System.out.println(h.n.n.n==null);
 }
}