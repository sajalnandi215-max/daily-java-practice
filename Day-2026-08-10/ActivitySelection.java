public class ActivitySelection {
 public static void main(String[] args){
  int[] s={1,3,0,5,8,5};
  int[] f={2,4,6,7,9,9};
  int i=0,count=1;
  for(int j=1;j<s.length;j++)
   if(s[j]>=f[i]){ count++; i=j; }
  System.out.println(count);
 }
}