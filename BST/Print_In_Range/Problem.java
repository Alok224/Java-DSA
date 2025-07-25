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

    public static void PrintInRange(Node root,int x, int y){

        

        if(root == null){
            return;
        }

        if(root.data >=x && root.data <=y){
            System.out.print(root.data + " ");
        }

        if(root.data > x){
            PrintInRange(root.left,x,y);
        }


        if(root.data < y){
            PrintInRange(root.right,x,y);
        }

    
    }

   public static Node inordersuccessor(Node root){
        if(root.left != null){
            root = root.left;
        }
        return root;
   }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static void main(String args[]){
        // main function
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0;i<values.length;i++){
            // call the function
            root = insert(root,values[i]);
        }

        // inorder(root);
        // System.out.println();

        
        // delete(root,4);
        // inorder(root);

        int x = 6;
        int y = 10;

        // call the function
       PrintInRange(root,x,y);
       
    }
}