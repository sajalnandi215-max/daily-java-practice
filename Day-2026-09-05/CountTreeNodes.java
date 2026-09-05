public class CountTreeNodes {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static int count(Node n){
  return n==null?0:1+count(n.l)+count(n.r);
 }
 public static void main(String[] args){
  Node r=new Node(1); r.l=new Node(2); r.r=new Node(3);
  System.out.println(count(r));
 }
}