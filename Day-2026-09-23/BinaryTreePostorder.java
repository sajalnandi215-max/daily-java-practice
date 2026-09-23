public class BinaryTreePostorder {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static void post(Node n){
  if(n==null) return;
  post(n.l); post(n.r); System.out.print(n.d+" ");
 }
 public static void main(String[] args){
  Node r=new Node(1);
  r.l=new Node(2); r.r=new Node(3);
  post(r);
 }
}