// to take an input from the user

// firstly import the package
import java.util.*;

class InputClass {
    public static void main(String[] args){
        // to take an input just create an object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // now I can use the methods of scanner class to take input
        String name = sc.nextLine();
        System.out.println(name);
    }
}