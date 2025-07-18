import java.util.*;
class Problem {
    public static void checkSubsequence(int[] nums, int k, int index,List<Integer> element){
        if(index == nums.length){
            return;
        }
        element.add(nums[index]);
        // call the recursive function
        checkSubsequence(nums,k,index+1,element);
        // to not add the element
        element.remove(element.size() - 1);
        checkSubsequence(nums,k,index+1,element);
    }
    public static boolean checkSubsequenceSum(int[] nums, int k) {
        //your code goes here
        List<Integer> element = new ArrayList<>();
        int index = 0;
        //  call the function
        checkSubsequence(nums,k,index,element);
        int sum = 0;
        for(int i = 0;i<element.size();i++){
            sum = sum + element.get(i);
        }
        if(sum == k){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = {1};
        int k = 1;
        boolean result = checkSubsequenceSum(nums,k);
        System.out.print(result);
    }
}