public class Problem10{
    public static void MoveAllX(int index,String str, StringBuilder Xstring, StringBuilder newstring){
            if(index == str.length()){
               StringBuilder result =  newstring.append(Xstring);
               System.out.println(result);
               return;
            }
            char currentcharacter = str.charAt(index);
            if(currentcharacter != 'x'){
                newstring.append(currentcharacter);
            }
            else{
                Xstring.append(currentcharacter);
            }
            // call the function
            MoveAllX(index + 1, str,Xstring,newstring);
        }
    public static void main(String args[]){
        
        // main function
        String str = "axvxfxbcxxd";
        // String Xstring;
        // String newstring;
        int index = 0;
        StringBuilder newstring = new StringBuilder();
        StringBuilder Xstring = new StringBuilder();
        // Call the function
        MoveAllX(index,str,Xstring,newstring);
    }
}