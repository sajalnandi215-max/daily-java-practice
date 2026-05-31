public class BSTMin {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static int min(Node n){
  while(n.l!=null) n=n.l;
  return n.d;
 }
 public static void main(String[] args){
  Node r=new Node(5); r.l=new Node(3);
  System.out.println(min(r));
 }
}