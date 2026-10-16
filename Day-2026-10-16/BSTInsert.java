public class BSTInsert {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static Node insert(Node n,int x){
  if(n==null) return new Node(x);
  if(x<n.d) n.l=insert(n.l,x);
  else n.r=insert(n.r,x);
  return n;
 }
 public static void main(String[] args){
  Node r=null;
  r=insert(r,5); insert(r,3); insert(r,7);
  System.out.println(r.l.d);
 }
}