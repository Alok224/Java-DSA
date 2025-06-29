// print hello world as output
// class FirstClass {
//     public static void main(String args[]){
//         System.out.println("Hello World");
//         System.out.println("Welcome to Java Programming!");
//     }
// }

// Calculate some operations
// class FirstClass{
//     public static void main(String args[]){
// 
//         // define the variables
//         int a = 4;
//         int b = 8;
//         int sum = a + b;
//         int division = b/a;
//         System.out.println("The sum is =" +  sum);
//         System.out.println("The division is =" +  division);
//     }
// }

// to Calculate a quiz 

// class FirstClass{
//     public static void main(String args[]){
//         // define the variables
//         int a = 20;
//         int b = 10;
//         float c = (a * b) /(a - b);
//         System.out.println("The result of the quiz is = " + c);
//     }
// }

// to take an input from the user

// firstly import the package
import java.util.*;

class FirstClass {
    public static void main(String[] args){
        // to take an input just create an object of scanner class
        Scanner sc = new Scanner(System.in);
        // now I can use the methods of scanner class to take input
        String name = sc.nextLine();
        System.out.println(name);
    }
}