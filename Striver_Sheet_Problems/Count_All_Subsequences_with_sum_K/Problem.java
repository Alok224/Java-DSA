import java.util.*;
class Problem{
    public static void countsubsequence(int[] nums, int k, List<Integer> element,int index){
        if(index == nums.length){
            int sum = 0;
            for(int i = 0;i<element.size();i++){
                sum = sum + element.get(i);
            }
            if(sum == k){
                System.out.print(element);
            }
            return;
        }
        element.add(nums[index]);
        // add or not add
        // call the recursive function
        countsubsequence(nums,k,element,index+1);

        // to not add the element
        element.remove(element.size() - 1);
        countsubsequence(nums,k,element,index+1);

    }
//     public int countSubsequenceWithTargetSum(int[] nums, int k) {
//         //your code goes here
//         List<Integer> element = new ArrayList<>();
//         
//         int index = 0;
//         // call the function
//         countsubsequence(nums,k,element,index);
// 
//         
//     }

    public static void main(String[] args) {
        int[] nums = {4, 2, 10, 5, 1, 3};
        int k = 5;
        List<Integer> element = new ArrayList<>();
        int index = 0;
        countsubsequence(nums, k, element, index);
    }   
}