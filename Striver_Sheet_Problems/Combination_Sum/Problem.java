import java.util.*;
class Problem{
    public static void combination(int[] candidates, int target, int index, List<List<Integer>> list, List<Integer> element){
        if(target < 0 || index == candidates.length){
            return;
        }
        if(target == 0){
            // if target is 0, add the current combination to the list
            list.add(new ArrayList<>(element));
            return;
        }
        element.add(candidates[index]);
        // call the recursive function, to add the multiple times Integer
        combination(candidates,target-candidates[index],index,list,element);

        // to not add the element
        element.remove(element.size() - 1);
        combination(candidates,target,index+1,list,element);

        // // to add multiple times Integer
        // combination(candidates,target-candidates[index],index,list,element);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> element = new ArrayList<>();
        int index = 0;
        List<Integer> emptyInnerList = new ArrayList<>();
        // call the function
        combination(candidates,target,index,list,element);
        
        return list;
    }
    public static void main(String args[]){
        int[] candidates = {2, 1, 2, 7, 6, 1, 5};
        int target = 8;
        Problem problem = new Problem();
        List<List<Integer>> result = problem.combinationSum(candidates,target);
        System.out.print(result);
    }
}