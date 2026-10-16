public class CountDigits {
 static int count(int n){
  return n==0?0:1+count(n/10);
 }
 public static void main(String[] args){
  System.out.println(count(12345));
 }
}