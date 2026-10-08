import java.util.*;
public class HashMapBasic {
 public static void main(String[] args){
  HashMap<String,Integer> m=new HashMap<>();
  m.put("A",1); m.put("B",2);
  System.out.println(m.get("A"));
 }
}