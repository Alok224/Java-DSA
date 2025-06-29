// // From Scratch
// import java.utils.*;
// public class InsertingMiddle{
// 
//     
// 
//     LinkedList<String> List = new LinkedList<String>();   
//     Node head;
// 
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }
// 
//     // inserting function
//     public void InsertMiddle(int index, String data){
// 
//         // case define
//         if(head == null || index = 0){
//             // create newnode
//             List.addFirst(data);
//             return;
//             
//         }
//         // Traverse the linkedlist
//         // define the newnode and currentnode
//         Node newnode = new Node(data);
//         Node currentnode = head;
//         int currentposition = 0;
//         while(currentposition < index - 1 && currentnode.next != null){
//             currentnode = currentnode.next;
//             currentposition++;
//         }
//         // insert the string in middle
//         newnode.next = currentnode.next;
//         currentnode.next = newnode;
//     }
// 
//     // To print list
//     public void printlist(){
//         // check if linkedlist is empty or not
//         if(head == null){
//             System.out.println("LinkedList is empty");
//             return;
//         }
// 
//         Node currentnode = head;
//         while (currentnode != null) {
//             System.out.print(currentnode.data + "->");
//             currentnode = currentnode.next;
//         }
//         System.out.println("NULL");
//     }
//     
// 
//     public static void main(String[] args){
//         int index;
//         String data;
// 
//         InsertingMiddle IM = new InsertingMiddle();
// 
//         // Call the function
//         IM.InsertMiddle(1, "a");
//         IM.printlist();
//     }
// }

public class InsertingMiddle {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at a given index
    public void InsertMiddle(int index, String data) {
        // Case 1: Empty list or insert at index 0
        if (head == null || index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node newNode = new Node(data);
        Node currentNode = head;
        int currentPosition = 0;

        // Traverse to the node before the desired index
        while (currentPosition < index - 1 && currentNode.next != null) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        // Insert the new node
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        InsertingMiddle IMlist = new InsertingMiddle();
        IMlist.InsertMiddle(0, "a");  // Insert at the beginning
        IMlist.InsertMiddle(1, "b");  // Insert at index 1
        IMlist.InsertMiddle(1, "x");  // Insert in the middle
        IMlist.printList();  // Output: a->x->b->NULL
    }
}