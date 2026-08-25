public class StackArray {
    int top=-1;
    int[] stack=new int[5];

    void push(int x){
        if(top==stack.length-1) return;
        stack[++top]=x;
    }

    int pop(){
        if(top==-1) return -1;
        return stack[top--];
    }

    public static void main(String[] args){
        StackArray s=new StackArray();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
    }
}