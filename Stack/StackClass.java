public class StackClass{

    
    class Node{
        int data;
        Node next;

        // constructor call
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class Stack{
        public static Node head;
        // stack is empty or not
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop(){

            // check the stack is empty or not
            if(isEmpty()){
                return -1;
            }

            // delete the top element
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            return top;
        }
}

    public static void main(String args[]){
        // main function
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}