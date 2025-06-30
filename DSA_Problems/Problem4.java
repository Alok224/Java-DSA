public class Problem4{
    
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

    // to find the middle
    public Node FindMiddle(Node head){
        // Follow the hare and turtle approach
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    // reverse the list
    public Node reverse(Node head){
        // reverse
        // declare three pointers
        Node currentnode = head;
        Node previousNode = null;

        // Traverse
        while(currentnode != null){
            Node nextNode = currentnode.next;
            currentnode.next = previousNode;
            previousNode = currentnode;
            currentnode = nextNode;            
        }
        return previousNode;
    }


    // check the linked list is palindrome or not
    public boolean IsPalindrome(){
        Node head = this.head;    
        // check if the list is empty or not
        if(head == null || head.next == null){
            return true;
        }

        // find the middle Node
        Node middleNode = FindMiddle(head);
        Node SecondHalfStart = reverse(middleNode.next);

        Node FirstHalfStart = head;
        // Traverse
        while(SecondHalfStart != null){
            if(FirstHalfStart.data != SecondHalfStart.data){
                return false;
            }
            FirstHalfStart = FirstHalfStart.next;
            SecondHalfStart = SecondHalfStart.next;
        }
        return true;
        
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
        Problem4 list = new Problem4();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        // list.addLast(5);
        // list.addLast(1);
        list.printlist();

        boolean result = list.IsPalindrome();  
        System.out.println("Is Palindrome? " + result);
    }
}