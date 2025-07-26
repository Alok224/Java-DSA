import java.util.*;
public class Problem{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        // the root contain some value then compare with the val
        if(root.data < val){
            // move to right subtree
            root.right = insert(root.right,val);
        }
        else{
            // move to left subtree
            root.left = insert(root.left,val);
        }
        return root;
    }

    public static void roottoleaf(Node root, ArrayList<Integer> list){
        
        

        if(root == null){
            return;
        }
        list.add(root.data);

        if(root.left == null && root.right == null){
            System.out.println(list);
            
        }
        else{
            roottoleaf(root.left, list);
            roottoleaf(root.right, list);

        }

        // remove the last element
        list.remove(list.size() -1);
        

    }
   

    

    

    public static void main(String args[]){
        // main function
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0;i<values.length;i++){
            // call the function
            root = insert(root,values[i]);
        }

        // root to leaf path
        // create a linked list
        ArrayList<Integer> list = new ArrayList<Integer>();
        // call the function
        roottoleaf(root,list);
        
       
    }
}