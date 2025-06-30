public class Problem5{

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            
        }
    }

    // add last element
    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode; 
            return;
        }
        Node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;
    }

    // Hare and turtle approach for detecting loops
    public boolean HasLoop(){

        Node head = this.head;

        // check the list is empty or not
        if(head == null){
            return false;
        }

        

        Node hare = head;
        Node turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }

    // print list
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "->");
            currentnode = currentnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]){
        // main function
        Problem5 list = new Problem5();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printlist();

        boolean result = list.HasLoop();
        System.out.println(result);
    }
}