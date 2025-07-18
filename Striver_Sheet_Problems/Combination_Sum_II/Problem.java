import java.util.*;
class Problem{
    public static void combination2(int[] candidates,int target,int index, List<List<Integer>> list, List<Integer> element){
        if(index == candidates.length){
            int sum = 0;
            for(int i = 0;i<element.size();i++){
                sum = sum + element.get(i);
            }
            if(sum == target){
                // Sort that subset
                for(int i = 0;i<element.size();i++){
                    for(int j = i+1;j<element.size();j++){
                        if (element.get(i) > element.get(j)) {
                        // Swap values directly in the list
                        int temp = element.get(i);
                        element.set(i, element.get(j));
                        element.set(j, temp);
                        }
                    }
                }
            for(int i = 0;i<list.size();i++){
                if(element.equals(list.get(i))){
                    return;
                }
            }
            // add the subset in the ArrayList (Copy)
            list.add(new ArrayList<>(element));
            }
            return;
        }
        // call the function to add the element
        element.add(candidates[index]);
        // call the recursive function to add the element
        combination2(candidates,target,index+1,list,element);

        // to not add the element
        element.remove(element.size() -1);
        // call the recursive function
        combination2(candidates,target,index+1,list,element);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> element = new ArrayList<>();
        int index = 0;
        // call the function
        combination2(candidates,target,index,list,element);
        return list;
    }
    public static void main(String args[]){
        int[] candidates = {4,4,2,1,4,2,2,1,3};
        int target = 6;
        Problem problem = new Problem();
        List<List<Integer>> result = problem.combinationSum2(candidates,target);
        System.out.print(result);
    }
}