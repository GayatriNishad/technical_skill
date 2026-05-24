import java.util.Stack;
public class queue {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // Output: 10 20 30
        System.out.println(q.dequeue()); // Output: 10
        System.out.println(q.peek()); // Output: 20
        q.display(); // Output: 20 30
    }
    int arr[];
    int front;
    int rear;
    int n;
    queue(int size){
        arr = new int[size];
        n = size;
        front = 0;
        rear = -1;
    }
    void enqueue(int X){
        if(rear == n - 1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = X;
    }
    int dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front++;
        return val;
    }
    int peek(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
