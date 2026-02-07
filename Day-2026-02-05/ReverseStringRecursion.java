public class ReverseStringRecursion {
    public static void main(String[] args){
        String str = "hello";
        System.out.println(reverse(str));
    }
    static String reverse(String s){
        if(s.length()==0) return s;
        return reverse(s.substring(1))+s.charAt(0);
    }
}