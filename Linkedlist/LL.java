public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // addFirst should be a method of LL, not Node
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // addLast should also be a method of LL, not Node
    public void addLast(String data) {
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

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        // if list is empty
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;

        // If I have only one Node
        if(head.next == null){
            // to delete that one Node
            head = null;
            return;
        }
        // if I 2 Node or more
        // Traverse
        Node secondlast = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            secondlast = secondlast.next;
            LastNode = LastNode.next;
        }
        secondlast.next = null;
    }

    public int getsize(){
        return size;
    }

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

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printlist();

        list.addLast("list");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();

        System.out.println(list.getsize());
        list.addFirst("This");
        list.printlist();
        System.out.println(list.getsize());
    }
}