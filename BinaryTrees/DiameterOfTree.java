public class DiameterOfTree{

    public static class Node{
         int data;
         Node left;
         Node right;

         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
    }

    public static class Binarytrees{
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

        public static int SumNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftcount = SumNodes(root.left);
            int rightcount = SumNodes(root.right);
            int resultheight = Math.max(leftcount,rightcount);
            return resultheight + 1;
        }

        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int diameter1 = diameter(root.left);
            int diameter2 = diameter(root.right);
            int diameter3 = SumNodes(root.left) + SumNodes(root.right) + 1;

            return Math.max(diameter3, Math.max(diameter1,diameter2));
        }
    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // main function
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildTree(nodes);
        int resultofcount = tree.SumNodes(root);
        System.out.println(resultofcount);
        int resultofdiameter = tree.diameter(root);
        System.out.println(resultofdiameter);
    }
}