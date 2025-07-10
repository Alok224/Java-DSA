public class HeightOfNodes{
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

    public static int heightoftree(Node root){
        if(root == null){
            return 0;
        }
        int heightofleft = heightoftree(root.left);
        int heightofright= heightoftree(root.right);

        int maxheight = Math.max(heightofleft, heightofright) + 1;
        return maxheight;
    }




    public static void main(String args[]){
        // main function
         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Binarytrees tree = new Binarytrees();
         Node root = tree.buildTree(nodes);
         System.out.println(root.data);

         int result = heightoftree(root);
         System.out.println(result);
    }
}