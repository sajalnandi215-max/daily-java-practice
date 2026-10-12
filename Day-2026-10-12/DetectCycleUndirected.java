import java.util.*;
public class DetectCycleUndirected {
 static boolean dfs(int v,int p,boolean[] vis,ArrayList<ArrayList<Integer>> g){
  vis[v]=true;
  for(int x:g.get(v)){
   if(!vis[x]){
    if(dfs(x,v,vis,g)) return true;
   } else if(x!=p) return true;
  }
  return false;
 }
 public static void main(String[] args){
  ArrayList<ArrayList<Integer>> g=new ArrayList<>();
  for(int i=0;i<3;i++) g.add(new ArrayList<>());
  g.get(0).add(1); g.get(1).add(0);
  g.get(1).add(2); g.get(2).add(1);
  System.out.println(dfs(0,-1,new boolean[3],g));
 }
}