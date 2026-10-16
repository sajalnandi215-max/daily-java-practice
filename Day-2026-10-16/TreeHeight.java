public class TreeHeight {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static int height(Node n){
  return n==null?0:1+Math.max(height(n.l),height(n.r));
 }
 public static void main(String[] args){
  Node r=new Node(1); r.l=new Node(2);
  System.out.println(height(r));
 }
}