import java.util.*;
class Conditions{
    public static void main(String args[]){
        // take the input from the user
        // Create the scanner class and its object
        // Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age:");
//         int age = sc.nextInt();
//         // check the Condition
//         if(age < 18){
//             System.out.println("You are not an adult");
//         }
//         else if(age >=18 && age < 60){
//             System.out.println("You are an adult");
// 
//         }
//         else{
//             System.out.println("You are a senior citizen");
//         }

        // to check the number is odd or even
        // Create the scanner class and its object
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number:");
            int number = sc.nextInt();
            // Now Apply the Condition
            if(number % 2 == 0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
    }
}