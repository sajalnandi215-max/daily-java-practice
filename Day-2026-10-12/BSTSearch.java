public class BSTSearch {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 static boolean search(Node n,int x){
  if(n==null) return false;
  if(n.d==x) return true;
  return x<n.d?search(n.l,x):search(n.r,x);
 }
 public static void main(String[] args){
  Node r=new Node(5); r.l=new Node(3); r.r=new Node(7);
  System.out.println(search(r,7));
 }
}