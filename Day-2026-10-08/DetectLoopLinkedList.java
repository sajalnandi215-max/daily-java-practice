public class DetectLoopLinkedList {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 public static void main(String[] args){
  Node h=new Node(1);
  h.n=new Node(2); h.n.n=h;
  Node s=h,f=h;
  boolean loop=false;
  while(f!=null && f.n!=null){
   s=s.n; f=f.n.n;
   if(s==f){loop=true;break;}
  }
  System.out.println(loop);
 }
}