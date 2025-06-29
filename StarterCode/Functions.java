import java.util.*;
import java.lang.Math;

public class Functions{

//     public static void PrintMyName(String name){
//         System.out.println("Your name is: " + name);
//         return;
//     }
// 
// 
//     public static void main(String args[]){
//         // It takes the input
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();
// 
//         // call the Function
//         PrintMyName(name);
//     }

    // Function to add two numbers and return the sum

//     public static int CalculateAdd(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
// 
//     public static void main(String[] args){
//         // takes the input
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
// 
//         // call the Function
//         int sum = CalculateAdd(a,b);
//         System.out.println("The sum of " + a + " and " + b + " is: " + sum);

    // }

    // logic for factorial numbers

//     public static int CalculateFactorial(int n){
//         // define the fac variable
//         int fac = 1;
//         for(int i = n; i>=1; i--){
//             fac = fac * i;
//         }
//         return fac;
//     }
// 
//     public static void main(String[] args){
//         // takes the input from the user
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();
// 
//         // Call the function for factorial
//         int fac = CalculateFactorial(n);
//         System.out.print("The factorial of your given number is: " + fac);
//     }

    // print the sum of odd numbers form 1 to n

//     public static int CalculateSumOfOdd(int n){
//         // define the variable
//         int odd = 0;
//         for(int i = 0; i<=n; i++){
//             odd = odd + (2*i + 1);
//         }
//         return odd;
//     }
// 
//     public static void main(String args[]){
//         // takes the input for n from the user
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();
// 
//         // call the function 
//         int odd = CalculateSumOfOdd(n);
//         System.out.print("The sum of odd numbers for given input: " + odd);
//     }

        // to print display the count of positive, negative and 0's entered numbers

//         public static int CountTheNumber(int number){
//             int count = 0;
//             int count1 = 0;
//             int count2 = 0;
//             if(number>0){
//                 count = count + 1;
//             }
//             else if(number == 0){
//                 count1 = count1 + 1;
//             }
//             else{
//                 count2 = count2 + 1;
//             }
//             System.out.println("The count of positive numbers is: " + count);
//             System.out.println("The count of negative numbers is: " + count2);
//             System.out.println("The count of 0's is: " + count1);
//             return count;
//             return count1;
//             return count2;
//         }
// 
//         // take the input form the user till the user wants
//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             int number;
//             do{
//                 System.out.print("Enter any number as much as you want: ");
//                 System.out.print("Enter the e if you want to stop");
//                 number = sc.next();
//                 if (number != 'e'){
//                     System.out.println("You entered this number: " + number);
//                     // call the function
//                      CountTheNumber(number);
//                 }
//                 else{
//                     System.out.println("You stopped the programme");
//                 }
//             }while(number != 'e');
// 
//             
//         }

//     double base = 2.0;
// double exponent = 3.0;
// double result = Math.pow(base, exponent); // result will be 8.0
// System.out.println(result);


    // Function to calculate the power of a number

//     public static double CalculatePower(double base, double exponent){
//         double powerresult = Math.pow(base, exponent);
//         return powerresult;
//     }
// 
//     public static void main(String args[]){
//         // takes the input from the user
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the base: ");
//         double base = sc.nextDouble();            
//         System.out.print("Enter the exponent: ");
//         double exponent = sc.nextDouble();
// 
//         // call the function
//         double powerresult = CalculatePower(base, exponent);
//         System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + powerresult);
//     }
}