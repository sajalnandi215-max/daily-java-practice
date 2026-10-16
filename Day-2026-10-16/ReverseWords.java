public class ReverseWords {
 public static void main(String[] args){
  String[] w="Java is fun".split(" ");
  for(int i=w.length-1;i>=0;i--)
   System.out.print(w[i]+" ");
 }
}