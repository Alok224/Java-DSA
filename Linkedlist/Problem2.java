import java.util.*;
public class Problem2{
    
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addElement(int data){
        Node newNode = new Node(data);
        // check the list is empty or not
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentnode = head;
        // Traverse
        while(currentnode != null){
            System.out.print(currentnode.data + "->");
            currentnode = currentnode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]){
        Problem2 list = new Problem2(); 
        LinkedList<Integer> List = new LinkedList<Integer>();
        // main function
        // take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to add: ");
        int count = sc.nextInt();
        System.out.println("Okk!, Add " + count + " these elements in linked list");
        // loop
        for(int i = 0;i<count;i++){
            int data = sc.nextInt();
            // add element
            list.addElement(data);
            
        }

        

        System.out.println("Enter the target number (delete nodes > this):");
        int target = sc.nextInt();

        // Delete nodes greater than 'target' using Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > target) {
                iterator.remove(); // Safe removal during iteration
            }
        }

        // Print the modified list
        System.out.println("List after deletion:");
        for (int num : list) {
            System.out.print(num + "->");
        }
        System.out.println("NULL");

        sc.close();
    

        
        list.printlist();
        sc.close();
    }
}