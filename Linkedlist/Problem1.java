import java.util.*;
public class Problem1{
    Node head;
    class Node{
        int data;
        Node next;

        // construct call
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addElement(int data){
        // create the node
        Node newNode = new Node(data);
        // check the list
        if(head == null){
            head = newNode;
            return;
        }

        // Traverse
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // search the specific element
    public void search(int data){
        // // check for list
        // if(head == null){
        //     System.out.println("list is empty");
        //     return;
        // }
        Node currentNode = head;
    //    Traverse
        int currentindex = 0;
        while(currentNode.next != null){
            if(currentNode.data == data){
                System.out.println(currentindex);
                return;
            }
            currentindex++;
            currentNode = currentNode.next;
        }
    }

    // print list
    public void printlist(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]){
        // main function
        Problem1 list = new Problem1();
        list.addElement(1);
        list.addElement(5);
        list.addElement(7);
        list.addElement(3);
        list.addElement(8);
        list.addElement(2);
        list.addElement(3);
        // list.printlist();
        list.search(2);
        // System.out.println(s);
        list.printlist();
    }
    
}



// public class Problem1 {
//     Node head;
// 
//     class Node {
//         int data;  // Changed from String to int (since you're adding numbers)
//         Node next;
// 
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
// 
//     // Add element to the end of the list (renamed from addElement)
//     public void addElement(int data) {
//         Node newNode = new Node(data);  // newNode is now properly declared
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;  // Fixed: newNode is in scope
//     }
// 
//     // Print the list (corrected method name: printlist → printList)
//     public void printList() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode != null) {
//             System.out.print(currentNode.data + "->");
//             currentNode = currentNode.next;
//         }
//         System.out.println("NULL");
//     }
// 
//     public static void main(String[] args) {
//         Problem1 list = new Problem1();
//         list.addElement(1);  // Now calls the correct method
//         list.addElement(2);
//         list.printList();  // Corrected method name
//     }
// }