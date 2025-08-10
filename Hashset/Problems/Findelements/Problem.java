import java.util.*;

public class Problem{
    public static void Majorityelement(int arr[]){
        // create a map
        HashMap<Integer, Integer> map = new HashMap<>();

        // Apply For loop
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i]) == true){
                // update the value
                map.put(arr[i],map.get(arr[i]) + 1);
            }
            else{
                // add the value
                map.put(arr[i],1);
            }
        }

        // Print All Keys
        for(int key : map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.print(key);
            }
        }
    }
    public static void main(String args[]){
        // main function 
        int arr[] = {1,2}; 
        // call the function
        Majorityelement(arr);
    }
}