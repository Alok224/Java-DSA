public class QueueY{

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
        this.size = n;
        // define the array
        arr = new int[n];

    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    // enqueue
    public static void add(int data){
        // if my stack is full or not
        if(rear == size -1){
            System.out.println("Full Queue");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    // Dequeue
    public static int Dequeue(){
        if(isEmpty()){
            return -1;
        }

        int front = arr[0];
        for(int i = 0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    // peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queued");
            return -1;
        }

        int front = arr[0];
        return front;
    }

    

    }
    
    public static void main(String args[]){
        // main function
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }

    }
}