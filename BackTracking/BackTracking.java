public class BackTracking{

    public static void printPermutation(String str, String permutation, int index){
        // base case
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        // loop
        for(int i = 0; i< str.length(); i++){
            // declare the currentchar
            char currentchar = Str.charAt(i);
            // string declare the newstring
            char newstring = str.substring(0,i) + str.substring(i+1);
            // call the function
            printPermutation(newstring, permutation + currentchar, index+1);
        }
    }

    public static void main(String args[]){
        // declare the String
        String str = "ABC";
        int index = 0;
        // Call the function
        printPermutation(str,"",index);
    }
}