// Merge sort
public class Problem19{
    public static void conqurer(int arr[],int si, int ei,int mid){
        int merged[] = new int[ei-si+1];

        int index1 = si;
        int index2 = mid+1;
        int x = 0;
        while(index1 <= mid && index2 <=ei){
            if(arr[index1] <= arr[index2]){
                merged[x] = arr[index1];
                x++;
                index1++;
            }
            else{
                merged[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while(index1 <= mid){
            merged[x++] = arr[index1++];
        }

        while(index2 <= ei){
            merged[x++] = arr[index2++];
        }

        for(int i = 0, j=si;i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        if(si==ei){
            return;
        }
        // find the mid element
        int mid = si + (ei-si)/2;
        // call the recursive function
        divide(arr,si,mid);
        // for 2nd divide again call the recursive function
        divide(arr,mid+1,ei);

        // conqurer function
        conqurer(arr,si,ei,mid);
    }
    public static void main(String args[]){
        // main function
        // define the array
        int arr[] = {6,3,9,5,2,8};
        int size = arr.length;
        int si = 0;
        int ei = size-1;
        // call the function
        divide(arr,si,ei);
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}