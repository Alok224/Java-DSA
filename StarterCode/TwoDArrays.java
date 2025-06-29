import java.util.*;
public class TwoDArrays{
    public static void main(String[] args){
        // takes the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int rows = sc.nextInt();
        System.out.print("Enter the value of column: ");
        int column = sc.nextInt();

        // define the array variable
        int[][] numbers = new int[rows][column];

        // to fill the values, create the for loop
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // to display the array output, create an another loop
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}