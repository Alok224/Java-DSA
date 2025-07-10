public class Problem15{
    public static void Permutations(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        // loop
        for(int i = 0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newstring = str.substring(0,i) + str.substring(i+1);
            // call the recursive function
            Permutations(newstring,permutation + currentChar);
        }
    }
    public static void main(String args[]){
        // main function
        String str = "abc";
        // call the function 
        Permutations(str,"");
    }
}