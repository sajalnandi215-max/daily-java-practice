import java.util.*;
public class TopologicalSort {
 static void dfs(int v,boolean[] vis,Stack<Integer> st,ArrayList<ArrayList<Integer>> g){
  vis[v]=true;
  for(int x:g.get(v))
   if(!vis[x]) dfs(x,vis,st,g);
  st.push(v);
 }
 public static void main(String[] args){
  ArrayList<ArrayList<Integer>> g=new ArrayList<>();
  for(int i=0;i<6;i++) g.add(new ArrayList<>());
  g.get(5).add(2); g.get(5).add(0);
  g.get(4).add(0); g.get(4).add(1);
  g.get(2).add(3); g.get(3).add(1);
  boolean[] vis=new boolean[6];
  Stack<Integer> st=new Stack<>();
  for(int i=0;i<6;i++) if(!vis[i]) dfs(i,vis,st,g);
  while(!st.isEmpty()) System.out.print(st.pop()+" ");
 }
}