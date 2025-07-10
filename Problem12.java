public class Problem12{
    public static void Subsequences(int index, String str, String newstring){
        if(index == str.length()){
            System.out.println(newstring);
            return;
        }
        char currentChar = str.charAt(index);

        // call recursive function
        Subsequences(index+1,str, newstring+currentChar);
        // Again call the recursive function
        Subsequences(index + 1, str, newstring);
    }
    public static void main(String args[]){
        // main function
        String str = "aaa";
        int index = 0;
        // call the function
        Subsequences(index, str,"");
    }
}