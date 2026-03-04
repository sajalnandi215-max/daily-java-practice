public class BSTMax {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static int max(Node n){
  while(n.r!=null) n=n.r;
  return n.d;
 }
 public static void main(String[] args){
  Node r=new Node(5); r.r=new Node(9);
  System.out.println(max(r));
 }
}