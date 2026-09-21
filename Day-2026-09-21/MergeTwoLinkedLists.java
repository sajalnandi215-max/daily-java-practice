public class MergeTwoLinkedLists {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 static Node merge(Node a,Node b){
  if(a==null) return b;
  if(b==null) return a;
  if(a.d<b.d){ a.n=merge(a.n,b); return a;}
  b.n=merge(a,b.n); return b;
 }
 public static void main(String[] args){
  Node a=new Node(1); a.n=new Node(3);
  Node b=new Node(2); b.n=new Node(4);
  Node r=merge(a,b);
  for(Node t=r;t!=null;t=t.n) System.out.print(t.d+" ");
 }
}