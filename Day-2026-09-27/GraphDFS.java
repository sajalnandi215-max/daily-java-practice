import java.util.*;
public class GraphDFS {
 static void dfs(ArrayList<ArrayList<Integer>> g,int s,boolean[] v){
  v[s]=true;
  System.out.print(s+" ");
  for(int x:g.get(s))
   if(!v[x]) dfs(g,x,v);
 }
 public static void main(String[] args){
  ArrayList<ArrayList<Integer>> g=new ArrayList<>();
  for(int i=0;i<4;i++) g.add(new ArrayList<>());
  g.get(0).add(1); g.get(1).add(2); g.get(2).add(3);
  dfs(g,0,new boolean[4]);
 }
}