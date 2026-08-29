import java.util.Arrays;
public class AnagramCheck {
 public static void main(String[] args){
  char[] a="listen".toCharArray();
  char[] b="silent".toCharArray();
  Arrays.sort(a); Arrays.sort(b);
  System.out.println(Arrays.equals(a,b));
 }
}