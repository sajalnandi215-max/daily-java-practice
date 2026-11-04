public class BinaryTreePreorder {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static void pre(Node n){
  if(n==null) return;
  System.out.print(n.d+" "); pre(n.l); pre(n.r);
 }
 public static void main(String[] args){
  Node r=new Node(1);
  r.l=new Node(2); r.r=new Node(3);
  pre(r);
 }
}