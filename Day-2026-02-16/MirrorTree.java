public class MirrorTree {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static void mirror(Node n){
  if(n==null) return;
  Node t=n.l; n.l=n.r; n.r=t;
  mirror(n.l); mirror(n.r);
 }
 public static void main(String[] args){
  Node r=new Node(1); r.l=new Node(2); r.r=new Node(3);
  mirror(r);
  System.out.println(r.l.d);
 }
}