import java.util.*;
public class BinaryTreesYT{

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

    static class Binarytrees{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newnode = new Node(nodes[index]);
            // shift that node to left and right
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }
    }

    public static void preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        // left part
        preorder(root.left);
        // right part
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        // left subpart
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }

        // left subpart
        postorder(root.left);
        // right subpart
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        // Declare the Queue
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        // Traverse
        while(!q.isEmpty()){
            Node currentNode = q.remove();

            if(currentNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null){
                q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static int CountOfNodes(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int leftNodes = CountOfNodes(root.left);
        int rightNodes = CountOfNodes(root.right);

        return leftNodes + rightNodes + 1;
        }

    public static void main(String args[]){
        // main function
        // array of nodes
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelOrder(root);
        int count = CountOfNodes(root);
        System.out.println(count);

    }
}

// if(root == null){
//             return;
//         }
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);
// 
//         // Traverse
//         while(!q.isEmpty()){
//             Node currentNode = q.remove();
// 
//             if(currentNode == null){
//                 System.out.println();
//                 if(q.isEmpty()){
//                     break;
//                 }
//                 else{
//                     q.add(null);
//                 }
//             }
//             else{
//                 System.out.print(currentNode.data + " ");
//                 if(currentNode.left != null){
//                     q.add(currentNode.left);
//                 }
//                 if(currentNode.right != null){
//                     q.add(currentNode.right);
//                 }
//             }
//         }