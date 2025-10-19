public class Classroom{
    static class Node{
        Node [] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0; i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    // for insertion
    public static void insert(String word){
        Node current = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(current.children[idx] == null){
                current.children[idx] = new Node();
            }
            // if it is the last node
            if(i == word.length() - 1){
                current.children[idx].eow = true;
            }
            current = current.children[idx];
        }
    }


    // for searcing
    public static boolean search(String key){
        Node current = root;
        for(int i = 0; i<key.length(); i++){
            int wordindex = key.charAt(i) - 'a';
            Node node = current.children[wordindex];
            if(node == null){
                return false;
            }
            if(i == key.length() -1 && node.eow == false){
                return false;
            }
            current = current.children[wordindex];
        }
        return true;
    }


    public static void main(String[] args){
        String words[] = {"the", "a", "there", "their", "any"};
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        String keys[] = {"the", "these", "their", "an"};
        for(int i = 0; i<keys.length; i++){
            if(search(keys[i]) == true){
                System.out.println("found");
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}