import java.util.Stack;
public class EvaluatePostfix {
    public static void main(String[] args){
        String exp="231*+9-";
        Stack<Integer> st=new Stack<>();
        for(char c:exp.toCharArray()){
            if(Character.isDigit(c)) st.push(c-'0');
            else{
                int b=st.pop();
                int a=st.pop();
                if(c=='+') st.push(a+b);
                if(c=='-') st.push(a-b);
                if(c=='*') st.push(a*b);
                if(c=='/') st.push(a/b);
            }
        }
        System.out.println(st.pop());
    }
}