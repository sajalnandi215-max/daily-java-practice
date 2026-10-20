import java.util.*;
public class FirstRepeatingElement {
 public static void main(String[] args){
  int[] a={10,5,3,4,3,5,6};
  HashSet<Integer> s=new HashSet<>();
  for(int i=a.length-1;i>=0;i--){
   if(s.contains(a[i])) System.out.println(a[i]);
   s.add(a[i]);
  }
 }
}