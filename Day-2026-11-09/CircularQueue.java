public class CircularQueue {
    int size=5,front=0,rear=0;
    int[] q=new int[size];
    void enqueue(int x){
        q[rear]=x;
        rear=(rear+1)%size;
    }
    void dequeue(){
        front=(front+1)%size;
    }
    public static void main(String[] args){
        CircularQueue q=new CircularQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        System.out.println(q.q[q.front]);
    }
}