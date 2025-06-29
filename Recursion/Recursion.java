import java.util.*;
import java.util.HashSet;

// Functions calls itself known as Recursion

public class Recursion{

//     public static void PrintNumbers(int n){
// 
//         // check the condition
//         if(n==0){
//             return;
//         }
// 
//         // print the number
//         System.out.println(n);
//         PrintNumbers(n-1);
//     }

    // public static void PrintSumNatural(int n, int i, int sum){
    //     if(n )
    //     sum = sum + i;
    //     PrintSumNatural(n,i-1,sum);
    // }

    // public static int CalculateFactorial(int n){
    //    if(n == 0 || n == 1){
    //     return 1;
    //    }
    //    return n * CalculateFactorial(n-1);
    // }

//     public static void TOH(int n, char TA, char TB, char TC){
//         // Create the base case 
//         if(n==1){
//             System.out.println("The disk 1 moved to " + TA + " to " + TC);
//             return;
//         }
// 
//         // remaining disk should be moved to tower A to B
//         // TB is now a destination like TC
//         TOH(n-1, TA,TC, TB);
//         System.out.println("The disk " + n + " moved " + TA + " To " + TC);
//         // Again call
//         TOH(n-1,TB,TA,TC);
//         
//     }


    // public static void ReverseString(String name, int index){
    //     // Define base case
    //     if(index < 0){
    //         // System.out.print(name.charAt(index));
    //         return;
    //     }
    //     System.out.println(name.charAt(index));
    //     ReverseString(name,index-1);
    // }
//     public static int first = -1;
//     public static int last = -1;
// 
//     public static void Occurence(String name, int index){
// 
//         if(index < 0){
//             System.out.println("This is your first Occurence: " + last);
//             System.out.println("This is your last Occurence: " + first);
//             return;
//         }
// 
//         if(name.charAt(index) == 'a'){
//             // check the Occurence
//             if(first == -1){
//                 first = index;
//             }else{
//                 last = index;
//             }
//         }
//         Occurence(name, index-1);
    // }

    // public static void CheckArraySorted(int[] arr, int index){
    //     // Base case
    //     if(index == arr.length -1){
    //         System.out.println("This is a sorted array");
    //         return;
    //     }
    //     if(arr[index] < arr[index+1]){
    //         CheckArraySorted(arr, index+1);
    //         // System.out.print("true");
    //     }
    //     else{
    //         System.out.println("This is not a sorted array");
    //         return;
    //     }
    //     
    // }

//     public static void MoveElementToLast(String name, int index,int count,String newstring){
// 
//         // Base case
//         if(index == name.length()){
//             // All are complete, Just add the count elements in newstring
//             // Give it a loop
//             for(int i = 0; i<count;i++){
//                 newstring = newstring + 'x';
//                 
//             }
//             System.out.println("This is your newstring: " + newstring);
//             return;
//         }

        // Give a condition
        // Define a variable
        // char currentcharacter = name.charAt(index);
        // if(currentcharacter == 'x'){
        //     count++;
        //     MoveElementToLast(name,index+1,count,newstring);
        // }
        // else{
        //     // Add the character to the new string
        //     newstring = newstring + currentcharacter;
        //     MoveElementToLast(name, index+1,count,newstring);
        // }
    // }

    // I would have to store the true and false in array so return type should be boolean
    // size should be 26
    // public static boolean array[] = new boolean[26];
    // public static void RemoveDuplicates(String name, int index, String newstring){
    //     // base case
    //     if(index == name.length()){
    //         System.out.println("This is your newstring: " + newstring);
    //         return;
    //     }
    //     // create the condition
    //     // define the character variable
    //     char currentcharacter = name.charAt(index);
    //     if(array[currentcharacter -'a'] == false){
    //         newstring = newstring + currentcharacter;
    //         array[currentcharacter - 'a'] = true;
    //         // call the recursive function
    //         RemoveDuplicates(name, index+1,newstring);
    //     }
    //     else{
    //         RemoveDuplicates(name, index+1,newstring);
    //     }
    // }

    // public static void PrintSubsequences(String name, int index, String newstring){
        // System.out.println("This is your subsequences: ");
        // base case
        // if(index == name.length()){
        //     System.out.println(newstring);
        //     return;
        // }
        // // Check the condition
        // char currentcharacter = name.charAt(index);
        // // call the recursive function for adding the char in newstring
        // PrintSubsequences(name, index+1, newstring+currentcharacter);
        // // call the recursive function for not adding the char
        // PrintSubsequences(name, index+1, newstring);
    // }
    // public static void PrintUniqueSubsequences(String name, int index, String newstring,HashSet<String> set){
    //     // base case
    //     if(index == name.length()){
    //         // condition for unique subsequences
    //         if(set.contains(newstring)){
    //             return;
    //         }
    //         else{
    //             System.out.println(newstring);
    //             set.add(newstring);
    //             return;
    //         }
    //     }
        // Declare the currentcharacter
        // char currentcharacter = name.charAt(index);
        // // call the recursive function for adding the character
        // PrintUniqueSubsequences(name,index+1,newstring+currentcharacter,set);
        // // call the recursive function for not adding the character
        // PrintUniqueSubsequences(name,index+1,newstring,set);
        
    // }
    // declare the keyapd mapping
    // public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    // public static void PrintKeypadCombination(String value,int index, String combinations){
    //     // base case
    //     if(index == value.length()){
    //         System.out.println(combinations);
    //         return;
    //     }
    //     char currentcharacter = value.charAt(index);
    //     String mapping = keypad[currentcharacter-'0'];
    //     for(int i = 0;i<mapping.length();i++){
    //         // call the function
    //         PrintKeypadCombination(value,index+1,combinations+mapping.charAt(i));
    //     }
    // }

   public static void PrintPermutations(String name, String combinations){

    // define the base case
    if(name.length() == 0){
        System.out.print(combinations + " ");
        return;
    }

    // try for loop
    for(int i = 0; i<name.length();i++){
        // Declare the currentcharacter
        char currentcharacter = name.charAt(i);
        // Using the substring method
        String newstring = name.substring(0,i) + name.substring(i+1);
        // call the recursive
        PrintPermutations(newstring,combinations+currentcharacter);
    }
   }

    public static void main(String args[]){
        // takes the input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // // Call the function
        // PrintNumbers(n);

        // Sum of first n natural numbers
        // Define the variable
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Give the value of n: ");
        // int n = sc.nextInt();
        // PrintSumNatural(n,1,0);

        // Factorial of n natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // // Call the function
        // int Factorial = CalculateFactorial(n);
        // System.out.print(Factorial);

        // Some advanced problems
        // Tower of hanoi using Recursion
        // takes the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of the disk: ");
        // int n = sc.nextInt();
        // // Call the function
        // TOH(n,'A','B','C');

        // To print the reverse of the String
        // Scanner sc = new Scanner(System.in);


        // String name = "abaacdaefaah";
        // To print the string define the index variable
        // int index = (name.length() - 1);
        // Call the function
        // ReverseString(name,index);
        // call the function
        // Occurence(name,index);

        // check if an array is sorted or not?(Strictly increasing)
        // give the array variable
        // int arr[] = {45,456,786,187};
        // int index = 0;
        // // pass this array into a function
        // CheckArraySorted(arr,index);   

        // Move all 'x' to the end of the string
        // String name = "axbcxxd";
        // int count = 0;
        // int index = 0;
        // // call the function
        // MoveElementToLast(name,index,count,"");

        // Remove duplicates from the given string
        // String name = "abbccda";
        // int index = 0;
        // Call the function
        // RemoveDuplicates(name,index,"");

        // Print all subsequences of the given string
        // String name = "aaa";
        // int index = 0;
        // // call the function
        // PrintSubsequences(name,index,"");

        // To print all the unique subsequences for a String
        // Define the string
        // String name = "aaa";
        // int index = 0;
        // // Define the Hashset
        // HashSet <String> set = new HashSet<>();
        // // call the function
        // PrintUniqueSubsequences(name,index,"",set);


        // To print all the keypad combinations
        // take a string
        // String value = "23";
        // int index = 0;
        // // Call the function
        // PrintKeypadCombination(value,index,"");

        // Some advanced problems on Recursion
        // print the permutations of the string
        // Declare the string
        String name = "abcde";
        // Call the function
        PrintPermutations(name,"");
    }
}