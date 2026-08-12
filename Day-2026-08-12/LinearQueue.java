public class LinearQueue {
    int front=-1,rear=-1,size=5;
    int[] q=new int[size];
    void enqueue(int x){
        if(rear==size-1) return;
        if(front==-1) front=0;
        q[++rear]=x;
    }
    void dequeue(){
        if(front==-1) return;
        front++;
    }
    public static void main(String[] args){
        LinearQueue q=new LinearQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        System.out.println(q.q[q.front]);
    }
}