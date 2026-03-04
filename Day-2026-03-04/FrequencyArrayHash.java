import java.util.*;
public class FrequencyArrayHash {
 public static void main(String[] args){
  int[] a={1,2,2,3,3,3};
  HashMap<Integer,Integer> m=new HashMap<>();
  for(int x:a) m.put(x,m.getOrDefault(x,0)+1);
  System.out.println(m);
 }
}