import java.util.Stack;
public class ReverseStringStack {
    public static void main(String[] args){
        String str="hello";
        Stack<Character> st=new Stack<>();
        for(char c:str.toCharArray()) st.push(c);
        while(!st.isEmpty()) System.out.print(st.pop());
    }
}