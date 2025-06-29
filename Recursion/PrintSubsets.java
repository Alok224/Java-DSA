import java.util.*;
public class PrintSubsets{

    public static void PrintSubsets(ArrayList<Integer> subset){
        for(int i = 0;i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            PrintSubsets(subset);
            return;
        }

        // Add hoga
        subset.add(n);
        findSubsets(n-1,subset);

        // add nhi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }

    public static void main(String[] args){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        // call the function
        findSubsets(n,subset);
    }
}