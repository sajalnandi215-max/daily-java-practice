public class FrequencyChar {
 public static void main(String[] args){
  String s="banana";
  int[] f=new int[256];
  for(char c:s.toCharArray()) f[c]++;
  System.out.println(f['a']);
 }
}