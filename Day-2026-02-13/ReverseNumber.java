public class ReverseNumber {
 static int rev(int n,int r){
  if(n==0) return r;
  return rev(n/10,r*10+n%10);
 }
 public static void main(String[] args){
  System.out.println(rev(123,0));
 }
}