public class Problem{

    static class Node{
        // children array
        Node[] children;
        Boolean eow;

        // Intially all nodes of children array are null
        public Node(){
            children = new Node[26];
            eow = false;

            for(int i = 0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();
    static int count = 0;

    // insert function
    public static void insert(String s){
        Node current = root;
        for(int i = 0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(current.children[index] == null){
                // store it
                current.children[index] = new Node();
                count++;
            }
            if(i == s.length() - 1){
                current.children[index].eow = true;
            }
            current = current.children[index];
        }
        
    }

    public static int getCount(){
        return count + 1;
    }

    // main function
    public static void main(String[] args){
        String str = "ababa";
        for(int i = 0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(getCount());
    }
}