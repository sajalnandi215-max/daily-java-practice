public class CountSetBits {
 public static void main(String[] args){
  int n=15,c=0;
  while(n>0){ c+=n&1; n>>=1; }
  System.out.println(c);
 }
}