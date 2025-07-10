public class Problem14{
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void KeypadCombo(String str, int index, String newstring){
        if(index == str.length()){
            System.out.println(newstring);
            return;
        }
        char currentChar = str.charAt(index);
        String keypadstring = keypad[currentChar - '0'];
        for(int i = 0;i<keypadstring.length(); i++){
            // call recursive function
            KeypadCombo(str,index + 1,newstring+keypadstring.charAt(i));
        }
    }
    public static void main(String args[]){
        // main function
        String str = "23";
        int index = 0;
        // call the function
        KeypadCombo(str,index,"");
    }
}