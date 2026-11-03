public class ToggleCase {
 public static void main(String[] args){
  String s="JaVa";
  String r="";
  for(char c:s.toCharArray())
   r+=Character.isUpperCase(c)?
      Character.toLowerCase(c):
      Character.toUpperCase(c);
  System.out.println(r);
 }
}