public class QueueLL{

    static class Node{
        int data;
        Node next;

        // constructor call
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }

        public static void add(int data){
            Node newnode = new Node(data);
            if(tail == null){
                tail = head = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public static int deletefirst(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;

            if(head == tail){
                tail = null;
            }

            head = head.next;

            return front;
        }

        public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }

        return head.data;
    }
    
    }

    

    public static void main(String args[]){
        // main function
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.deletefirst());
        q.add(6);
        System.out.println(q.deletefirst());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deletefirst();
        }
    }
}