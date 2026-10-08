import java.util.*;
public class LevelOrderTraversal {
 static class Node{int d;Node l,r;Node(int d){this.d=d;}}
 public static void main(String[] args){
  Node r=new Node(1); r.l=new Node(2); r.r=new Node(3);
  Queue<Node> q=new LinkedList<>();
  q.add(r);
  while(!q.isEmpty()){
   Node n=q.poll();
   System.out.print(n.d+" ");
   if(n.l!=null) q.add(n.l);
   if(n.r!=null) q.add(n.r);
  }
 }
}