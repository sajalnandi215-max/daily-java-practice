public class CountVowels {
 public static void main(String[] args){
  String s="education";
  int c=0;
  for(char ch:s.toCharArray())
   if("aeiou".indexOf(ch)!=-1) c++;
  System.out.println(c);
 }
}