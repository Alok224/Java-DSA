import java.util.*;
public class Problem{
//     public static void Unionoftwoarr(int[] arr1,int[] arr2){
//         // create a hashmap
//         HashMap<Integer,Integer> map = new HashMap<>();
// 
//         for(int i = 0;i<arr1.length;i++){
//             if(map.containsKey(arr1[i]) == true){
//                 // update the value
//                 map.put(arr1[i],map.get(arr1[i]) + 1);
//             }
//             else{
//                 // add the value
//                 map.put(arr1[i],1);
//             }
//         }
// 
//         for(int j = 0;j<arr2.length;j++){
//             if(map.containsKey(arr2[j]) == true){
//                 // update the value
//                 map.put(arr2[j],map.get(arr2[j]) + 1);
//             }
//             else{
//                 // add the value
//                 map.put(arr2[j],1);
//             }
//         }
// 
//     // print all the keys
//     for(int key : map.keySet()){
//         System.out.print(key);
//     }
//     }
//     public static void main(String args[]){
//         // main function
//         int[] arr1 = {7,3,9};
//         int[] arr2 = {6,3,9,2,9,4};
// 
//         // call the function
//         Unionoftwoarr(arr1,arr2);
//     }

        public static void Unionoftwoarr(int[] arr1,int[] arr2){
            // create a hashset
            HashSet<Integer> set = new HashSet<>();

            for(int i= 0; i<arr1.length; i++){
                set.add(arr1[i]);
            }

            for(int i = 0; i<arr2.length;i++){
                set.add(arr2[i]);
            }

            System.out.print(set);

        }

        public static void main(String args[]){
            // main function 
            int[] arr1 = {7,3,9};
            int[] arr2 = {6,3,9,2,9,4};

            // call the function
            Unionoftwoarr(arr1,arr2);
        }
}