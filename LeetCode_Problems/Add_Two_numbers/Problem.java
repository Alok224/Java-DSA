class Problem{
    Node head;
    static class Node{
        int data;
        Node next;
        // constructor call
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node currentnode = head;
        while(currentnode.next != null){
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;

    }

    public void addlist(){
        
    }

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
        System.out.println();
    }


    public static void main(String args[]){
        // main function
        Problem list1 = new Problem();
        Problem list2 = new Problem();
        Problem list3 = new Problem();

        list1.addLast(1);
        list1.addLast(2);

        list2.addLast(2);
        list2.addLast(3);

        list1.printlist();
        list2.printlist();
        
    }
}