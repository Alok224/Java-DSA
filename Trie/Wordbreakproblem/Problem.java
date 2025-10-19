public class Problem{
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            eow = false;
            // Intially set to null
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node current = root;
        for(int i = 0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                // value not store, Store that character.
                current.children[index] = new Node();
            }

            if(i == word.length() -1){
                current.children[index].eow = true;
            }
            current = current.children[index];
        }
    }

    public static boolean search(String word){
        Node current = root;

        for(int i = 0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(current.children[index] == null){
                // word is not stored
                return false;
            }

            if(i == word.length() - 1 && current.children[index].eow == false){
                return false;
            }

            current = current.children[index];
        }
        return true;
    }

    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i = 1; i<=key.length(); i++){
            // firstpart
            String firstpart = key.substring(0, i);
            String secondpart = key.substring(i);

            // recursive call
            if(search(firstpart) == true && wordbreak(secondpart)){
                return true;
            }

        }

        return false;
    }




    public static void main(String args[]){
        // words array
        String words[] = {"i","like","sam","samsung","mobile","ice"};
        String wordcase = "ilikesamsung";
        // inserting words
        int n = words.length;
        for(int i = 0; i<n; i++){
            insert(words[i]);
        }
        System.out.println(wordbreak(wordcase));
    }
}