import java.util.*;

public class Imp{
    // <k,v> --> Generics
    public static class Hashmap<K,V>{ 
        private class Node{
            K key;
            V value;

            // constructor call
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }

        }
        // declare the number of nodes and bucket size
        private int n;
        private int N;
        // declare the linkedlist as bucket
        // Like int[] bucket;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")

        // constructor of Hashmap
        Hashmap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i< N;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
    }

        private int hashfunction(int key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private void searchinll(int key, int bi){
            LinkedList<Node> ll = buckets[bi];
            // to search the node apply loop
            for(int i = 0;i<ll.size();i++){
                if(ll.get(i) == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            // declare the old bucket initially to store the nodes in large size bucket
           LinkedList<Node> oldbucket[] = buckets;
            // declare the size
            buckets = new LinkedList[N*2];
            
            for(int i= 0; i<N*2; i++){
                bucket[i] = new LinkedList<>();
            }
            // store the node of oldbucket in large size bucket
            for(int i = 0; i<oldbucket.length;i++){
                LinkedList<Node> ll = oldbucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }
        // implementation of put
        public static void put(K key, V value){
            // create a function that gives you the bucket index
            int bi = hashfunction(key);
            // search that linkedlist through data index
            int di = searchinll(key,bi);
            
            // if that key doesn't exist then di == -1 otherwise it have some value
            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
                Node node = buckets[bi].get(di);
                // update the value of node
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                // rehashing
                rehash();
            }
        }

        public static v get(K Key){
            int bi = hashfunction(Key);
            int di = searchinll(key,bi);

            if(di == -1){
                // key doesn't exist
                return null;
            }
            else{
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        public static boolean containsKey(K Key){
            int bi = hashfunction(Key);
            int di = searchinll(Key,bi);

            if(di == -1){
                return false;
            }
            else{
                return true;
            }
        }

        public static v remove(K Key){
            int bi = hashfunction(Key);
            int di = searchinll(Key, bi);

            if(di == -1){
                return null;
            }
            else{
                // access that specific node that contains key and value and delete that node
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
                
            }
        }

        public static boolean isEmpty(){
            return n==0;
        }

        public static ArrayList<k> keyset(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0;j<ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
        return keys;
        }


        public static void main(String args[]){
            HashMap<String, Integer> map = new HashMap<>();
            map.put("China" , 444);
            map.put("India", 67);
            map.put("Switzerland", 98);
            map.put("US", 88);
            ArrayList<String> Keys = map.keyset();
            for(int i = 0; i< Keys.size();i++){
                System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
            }
        }
    
}
