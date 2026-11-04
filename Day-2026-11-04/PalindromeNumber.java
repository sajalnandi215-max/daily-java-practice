public class PalindromeNumber {
 static int rev(int n,int r){
  return n==0?r:rev(n/10,r*10+n%10);
 }
 public static void main(String[] args){
  int n=121;
  System.out.println(n==rev(n,0));
 }
}