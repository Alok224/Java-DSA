public class Problem3{
    Node head;

    class Node{
        int data;
        Node next;

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

    public Node RemoveNthFromEnd(int n){
        if(head.next == null){
            return null;
        }

        // Traverse
        int size = 0;
        Node currentnode = head;
        while(currentnode != null){
            currentnode = currentnode.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int indextosearch = size - n;
        Node previousNode = head;
        int i = 1;
        while(i<indextosearch){
            previousNode = previousNode.next;
            i++;
        }
        previousNode.next = previousNode.next.next;
        return head;
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
        // main function
        Problem3 list = new Problem3();
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printlist();

        list.RemoveNthFromEnd(3);
        list.printlist();
    }
}