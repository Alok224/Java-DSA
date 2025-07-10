import java.util.*;

// First Approach
// public class Problem11 {
//     public static void removeDuplicates(int index, String str, HashSet<Character> set) {
//         if (index == str.length()) {  // Base case: end of string
//             System.out.println("Unique characters: " + set);
//             return;
//         }
// 
//         char currentChar = str.charAt(index);
//         if (!set.contains(currentChar)) {
//             set.add(currentChar);      
//             
//         }
//         removeDuplicates(index + 1, str, set); 
//     }
// 
//     public static void main(String[] args) {
//         String str = "abbccda";
//         HashSet<Character> set = new HashSet<>();
//         removeDuplicates(0, str, set);
//     }
// }

// Second Approach

public class Problem11{
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int index, String newstring){
        if(index == str.length()){
            System.out.println(newstring);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar - 'a'] == true){
            // call the recursive function
            removeDuplicates(str,index+1,newstring);
        }
        else{
            newstring += currentChar;
            map[currentChar-'a'] = true;
            removeDuplicates(str,index+1,newstring);
        }
    }
    public static void main(String args[]){
        // main function
        String str = "abbccda";
        int index = 0;
        // call the function
        removeDuplicates(str,index,"");

    }
}