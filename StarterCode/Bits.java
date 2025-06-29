import java.util.*;

public class Bits{
    public static void main(String[] args){
        int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;

        // Now, take the operation AND
        if((n & bitmask) != 0){
            System.out.print("The bit was one!");
        }else{
            System.out.print("The bit was zero!");
        }
    }
}