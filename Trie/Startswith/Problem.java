public class Problem{
    static class Node{
        Node children[];
        Boolean eow;

        public Node(){
            children = new Node[26];
            Boolean eow = false;
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String s){
        Node current = root;

        for(int i = 0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(current.children[index] == null){
                // store it
                current.children[index] = new Node();
            }
            if(i == s.length() -1){
                current.children[index].eow = true;
            }
            current = current.children[index];
        }
    }

    public static Boolean search(String s){
        Node current = root;
        for(int i = 0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            // update the root
            current = current.children[index];
        }
        return true;
    }

    public static void main(String args[]){
        String[] words = {"apple","app","mango","woman"};
        String prefix = "man";
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        // for search
        System.out.println(search(prefix));
    }
}