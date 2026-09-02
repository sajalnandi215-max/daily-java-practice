public class DeleteNodeLinkedList {
 static class Node{int d;Node n;Node(int d){this.d=d;}}
 static Node head;
 static void add(int d){Node n=new Node(d);n.n=head;head=n;}
 static void delete(int key){
  Node t=head,p=null;
  if(t!=null && t.d==key){head=t.n;return;}
  while(t!=null && t.d!=key){p=t;t=t.n;}
  if(t==null) return;
  p.n=t.n;
 }
 static void print(){
  for(Node t=head;t!=null;t=t.n) System.out.print(t.d+" ");
 }
 public static void main(String[] args){
  add(1);add(2);add(3);
  delete(2); print();
 }
}