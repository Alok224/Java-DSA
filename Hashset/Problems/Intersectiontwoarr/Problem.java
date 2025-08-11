import java.util.*;
public class Problem{
    public static void Intersectionoftwoarr(int[] arr1,int[] arr2){
        // create a map
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< arr1.length; i++){
            if(map.containsKey(arr1[i]) == true){
                // update the value
                map.put(arr1[i],map.get(arr1[i]) + 1);
            }
            else{
                // add the key
                map.put(arr1[i],1);
            }
        }

        for(int i = 0; i< arr2.length; i++){
            if(map.containsKey(arr2[i]) == true){
                // update the value
                map.put(arr2[i],map.get(arr2[i]) + 1);
            }
            else{
                // add the key
                map.put(arr2[i],1);
            }
        }
    
        // print that key that have value greater than 1.

        for(int key : map.keySet()){
            if(map.get(key) > 1){
                System.out.print(key);
            }
        }
    }
    public static void main(String args[]){
    // main function
    int[] arr1 = {7,3,9};
    int[] arr2 = {6,3,9,2,9,4};

    // call the function
    Intersectionoftwoarr(arr1,arr2);
    }
}