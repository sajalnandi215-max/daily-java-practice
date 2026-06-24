public class RemoveDuplicatesString {
 public static void main(String[] args){
  String s="programming", r="";
  for(char c:s.toCharArray())
   if(r.indexOf(c)==-1) r+=c;
  System.out.println(r);
 }
}