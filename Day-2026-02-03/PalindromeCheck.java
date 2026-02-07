public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}