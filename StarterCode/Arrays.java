import java.util.*;
public class Arrays{
    // public static void main(String[] args){
    //     // define the Array
    //     int marks[] = new int[3];
    //     marks[0] = 34;
    //     marks[1] = 94;
    //     marks[2] = 90;
    //     // Now, print the Array marks
    //     for(int i = 0; i<3; i++){
    //         System.out.println(marks[i]);
    //     }
    // }

    public static void main(String[] args){
        // takes the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array as much as you want: ");
        int size = sc.nextInt();
        // define the Array
        int[] number = new int[size];

        // to fill the input values in number Array, create a loop
        System.out.print("Give the values for Array: ");
        for(int i = 0; i<number.length; i++){
            number[i] = sc.nextInt();
        } 

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        for(int i = 0; i<number.length; i++){
            if(number[i] == x){
                System.out.println("Your x value is found in Array and its index is: " + i);
            }
        }
    }
}