public class BST{
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

    public static Node delete(Node root, int val){
        // First step is search the given value for delete
        if(root.data > val){
            root.left = delete(root.left,val);
        }
        else if(root.data < val){
            root.right = delete(root.right,val);
        }

        else{
             // if root.data == null
            //  I would have to delete the Node
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            else if(root.left == null){
                return root.right;
            }
            
            else if(root.right == null){
                return root.left;
            }
            else{
                // case 3
                Node IS = inordersuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right,IS.data);
            }
        }
        return root;
    }

    public static Node inordersuccessor(Node root){
        while(root.left != null){
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

        inorder(root);
        System.out.println();

        // if(search(root,2)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("Not found");
        // }
        delete(root,4);
        inorder(root);

    }
}