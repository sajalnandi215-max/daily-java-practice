public class BSTInorder {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static void inorder(Node n){
  if(n==null) return;
  inorder(n.l); System.out.print(n.d+" "); inorder(n.r);
 }
 public static void main(String[] args){
  Node r=new Node(4); r.l=new Node(2); r.r=new Node(6);
  inorder(r);
 }
}