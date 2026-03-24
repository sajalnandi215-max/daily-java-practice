import java.util.Stack;
public class InfixToPostfix {
    static int prec(char c){
        if(c=='+'||c=='-') return 1;
        if(c=='*'||c=='/') return 2;
        return -1;
    }
    public static void main(String[] args){
        String exp="a+b*c";
        Stack<Character> st=new Stack<>();
        String res="";
        for(char c:exp.toCharArray()){
            if(Character.isLetterOrDigit(c)) res+=c;
            else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek()))
                    res+=st.pop();
                st.push(c);
            }
        }
        while(!st.isEmpty()) res+=st.pop();
        System.out.println(res);
    }
}