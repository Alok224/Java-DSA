import java.util.*;
public class Problem13{
    public static void UniqueSubsequences(int index, String str, String newstring,HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char currentChar = str.charAt(index);
        UniqueSubsequences(index+1,str,newstring,set);
        UniqueSubsequences(index+1,str,newstring+currentChar,set);
    }
    public static void main(String args[]){
        // main function
        String str = "aaa";
        int index = 0;
        HashSet<String> set = new HashSet<String>();
        // call the function
        UniqueSubsequences(index, str, "",set);
    }
} 