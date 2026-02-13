public class PowerRecursion {
 static int pow(int a,int b){
  return b==0?1:a*pow(a,b-1);
 }
 public static void main(String[] args){
  System.out.println(pow(2,5));
 }
}