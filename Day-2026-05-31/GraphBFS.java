import java.util.*;
public class GraphBFS {
 static void bfs(ArrayList<ArrayList<Integer>> g,int s){
  boolean[] v=new boolean[g.size()];
  Queue<Integer> q=new LinkedList<>();
  v[s]=true; q.add(s);
  while(!q.isEmpty()){
   int n=q.poll();
   System.out.print(n+" ");
   for(int x:g.get(n))
    if(!v[x]){ v[x]=true; q.add(x); }
  }
 }
 public static void main(String[] args){
  ArrayList<ArrayList<Integer>> g=new ArrayList<>();
  for(int i=0;i<4;i++) g.add(new ArrayList<>());
  g.get(0).add(1); g.get(1).add(2); g.get(2).add(3);
  bfs(g,0);
 }
}