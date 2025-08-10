import java.util.*;
import java.util.Map;
public class Hashmap{
    public static void main(String args[]){
        // main function

        HashMap<String, Integer> map = new HashMap<>();
        // insertion

        map.put("India" ,120);
        map.put("US", 34);
        map.put("China", 144);

        System.out.print(map);

        map.put("China", 180);
        System.out.println(map);

        // search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }

        // to get the value of the Key.
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // Apply loop in array
        int arr[] = {2,3,4,5,6,7};
        for(int val : arr){
            System.out.print(val + " ");
        }

        // iterator
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // to get the keys and values together.
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        // to remove the key and value
        map.remove("China");
        System.out.println(map);

    }
}