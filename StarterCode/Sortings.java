import java.util.*;

public class Sortings{

    // public static void BubbleSorting(int arr[]){
    //     for(int i = 0; i< arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static void SelectionSorting(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
      } 

    public static void main(String args[]){
        // Buuble Sorting

        // Create an array, takes the input for that
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Size of array: ");
        // int size = sc.nextInt();
        // // Now define the array variable
        // int[] arr = new int[size];
        // System.out.println("Enter the values for the array: ");
        // // takes the input values from the user
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Your unsorted array is: ");
        // // Print the array
        // for(int i = 0; i< arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // // Now sort the array
        // // try for loop
        // for(int i = 0; i<arr.length-1; i++){
        //     for(int j = 0; j<arr.length-i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             // swap
        //             int temp;
        //             temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        //     
        // }
        // 
        // // Call the function
        // System.out.println("Sorted array: ");
        // BubbleSorting(arr);


        // Selection Sorting
        
        // time complexity = O(n^2);
        // take the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the values of the array: ");
        // Define the array variable
        int[] arr = new int[size];
        // Take the values from the user
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // print the array
        System.out.println("This is your unsorted array: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Now sort the array
        for(int i = 0; i< arr.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
        }
        int temp;
        temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
        }
        System.out.println("This is your sorted array: ");
        SelectionSorting(arr);
    }
}