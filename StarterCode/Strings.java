import java.util.*;
public class Strings{
    public static void main(String[] args){
        // takes the input from the user
        // Scanner sc = new Scanner(System.in);
        // String FirstName = "Alok";
        // String LastName = "Goyal";
        // String FullName = FirstName + LastName;
        // System.out.print(FullName);

        // To compare the Strings, we use .CompareTo method
        String name = "Alok";
        // String name1 = "Alok";
        // // Now compare the Strings
        // if(name.compareTo(name1) == 0){
        //     System.out.print("Both the Strings are equal");
        // }
        // else{
        //     System.out.println("Both the strings are not equal");
        // }

        // String builder

        StringBuilder sb = new StringBuilder("Alok");
        System.out.print(sb);

        // If I want to access any char
        System.out.println(sb.charAt(0));

        // If you want to set any character
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // to insert any char in our String
        sb.insert(2,"u");
        System.out.println(sb);

        // to delete any char in our strings
        // sb.delete(begin index, (n-1) index)
        sb.delete(2,3);
        System.out.println(sb);

        // To append any char in our strings
        sb.append("i");
        System.out.println(sb);

    }
}