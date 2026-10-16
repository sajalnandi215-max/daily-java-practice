public class RemoveSpecialChars {
 public static void main(String[] args){
  String s="a@b#c!";
  System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
 }
}