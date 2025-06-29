public class ReverseIterate{

    Node head;

    class Node{
        int data;
        Node next;

        // constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add element to last
    public void addLast(int data){
        Node newNode = new Node(data);
        // check if head is null or not
        if(head == null){
            head = newNode;
            return;
        }

        Node currentnode = head;
        while(currentnode.next != null){
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;
    }

    // reverse linked list
    public void reverselist(){
        
        // check list is empty or not
        if(head == null || head.next == null){
            return;
        }

        // define
        Node previousNode = head;
        Node currentnode = head.next;
        // Traverse
        while(currentnode != null){
            Node nextNode = currentnode.next;
            currentnode.next = previousNode;

            previousNode = currentnode;
            currentnode = nextNode;
        }
        head.next = null;
        head = previousNode;
        
    }

    // print list
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentnode = head;
        while(currentnode != null){
            System.out.print(currentnode.data + "->");
            currentnode = currentnode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]){
        // main function
        ReverseIterate list = new ReverseIterate();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printlist();
        list.reverselist();
        list.printlist();
    }
}