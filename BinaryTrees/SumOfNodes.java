public class SumOfNodes{
    
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
        // function for creating tree
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newnode = new Node(nodes[index]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }
    }

    public static int SumNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = SumNodes(root.left);
        int rightsum = SumNodes(root.right);
        return root.data + leftsum + rightsum;
    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        int result = SumNodes(root);
        System.out.println(result);
    }
}