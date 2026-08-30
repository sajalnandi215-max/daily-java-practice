public class LongestWord {
 public static void main(String[] args){
  String s="Java is very powerful language";
  String[] w=s.split(" ");
  String max="";
  for(String x:w) if(x.length()>max.length()) max=x;
  System.out.println(max);
 }
}