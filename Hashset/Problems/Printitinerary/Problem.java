import java.util.*;
public class Problem{
    public static String getstart(HashMap<String, String> map){
        // create a reversemap
        HashMap<String, String> reversemap = new HashMap<>();

        // try loop
        for(String key: map.keySet()){
            reversemap.put(map.get(key),key);
        }

        // Now Check the start point
        for(String key: map.keySet()){
            if(reversemap.containsKey(key) == false){
            // that key is my starting point
            return key;
        }
        }
        return null;
    }
    public static void main(String args[]){
        // main function
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai","Banglore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        // call the function
        String start = getstart(map);
        while(map.containsKey(start) == true){
            System.out.println(start);
            start = map.get(start);
        }
        System.out.println(start);
        
}
}