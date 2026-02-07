public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int lcm = (a*b)/gcd(a,b);
        System.out.println("LCM: " + lcm);
    }
    static int gcd(int x,int y){
        while(y != 0){
            int t = y; y = x % y; x = t;
        }
        return x;
    }
}