import java.util.*;
public class GraphAdjacencyList {
 public static void main(String[] args){
  int V=4;
  ArrayList<ArrayList<Integer>> g=new ArrayList<>();
  for(int i=0;i<V;i++) g.add(new ArrayList<>());
  g.get(0).add(1); g.get(1).add(2); g.get(2).add(3);
  System.out.println(g);
 }
}