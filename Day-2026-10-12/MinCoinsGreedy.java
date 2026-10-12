public class MinCoinsGreedy {
 public static void main(String[] args){
  int[] c={1,2,5,10};
  int amt=27,count=0;
  for(int i=c.length-1;i>=0;i--)
   while(amt>=c[i]){ amt-=c[i]; count++; }
  System.out.println(count);
 }
}