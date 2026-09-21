public class NthFromEnd {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 public static void main(String[] args){
  Node h=new Node(1);
  h.n=new Node(2); h.n.n=new Node(3);
  int n=2;
  Node f=h,s=h;
  for(int i=0;i<n;i++) f=f.n;
  while(f!=null){s=s.n; f=f.n;}
  System.out.println(s.d);
 }
}