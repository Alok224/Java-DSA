public class CircularQueue{

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
        this.size = n;
        // define the array
        arr = new int[n];

    }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFull(){
        return (rear+1) % size == front;
    }

    // enqueue
    public static void add(int data){

        if(front == -1){
            front = 0;
        }

        // if my stack is full or not
        if(isFull()){
            System.out.println("Full Queue");
            return;
        }

        rear = (rear+1) % size;
        arr[rear] = data;
    }


    // Dequeue
    public static int Dequeue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }

        int result = arr[front];
        // single element condition
        if(rear == front){
            rear = front = -1;
        }
        else{
            front = (front + 1)%size;
        }
        return result;
        
    }

    // peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queued");
            return -1;
        }

        
        return arr[front];
    }

    

    }

    public static void main(String args[]){
        // main function
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.Dequeue());
        q.add(6);
        System.out.println(q.Dequeue());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }
    }
}