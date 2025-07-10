public class Problem9{
    public static boolean SortedArray(int index, int[] arr){
        // base case
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] >= arr[index + 1]){
            return false;
        }
        return SortedArray(index + 1,arr);
    }
    public static void main(String args[]){
        // main function
        int arr[] = {1,2,3,4,4};
        int index = 0;
        boolean result = SortedArray(index,arr);
        System.out.println(result);
    }
}