import java.util.*;
class Problem{
    public static void FindSubset(int index, List<List<Integer>> list, int[] nums ,List<Integer> element){
        // base case
        if(index == nums.length){
            list.add(new ArrayList<>(element));
            return;
        }
        // access the current element from the Array
        element.add(nums[index]);
        // call the recursive function
        FindSubset(index+1,list,nums,element);

        // to not add the element
        element.remove(element.size() - 1);
        // call the recursive function again
        FindSubset(index+1,list,nums,element);
        

    }
    // public List<List<Integer>> powerSet(int[] nums) {
    //     //your code goes here
    //     int index = 0;
    //     List<List<Integer>> list = new ArrayList<>(); 
    //     List<Integer> element = new ArrayList<>();
    //     // call the function
    //     FindSubset(index,list,nums,element);
    // }

    public static void main(String args[]){
        int index = 0;
        int[] nums = {1,2,3};
        List<List<Integer>> list = new ArrayList<>(); 
        List<Integer> element = new ArrayList<>();
        // call the function
        FindSubset(index,list,nums,element);
        System.out.println(list);
        
    }
}