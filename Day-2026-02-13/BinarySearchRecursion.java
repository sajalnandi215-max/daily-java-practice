public class BinarySearchRecursion {
 static int bs(int[] a,int l,int r,int x){
  if(l>r) return -1;
  int m=(l+r)/2;
  if(a[m]==x) return m;
  return a[m]>x?bs(a,l,m-1,x):bs(a,m+1,r,x);
 }
 public static void main(String[] args){
  int[] a={1,2,3,4,5};
  System.out.println(bs(a,0,a.length-1,4));
 }
}