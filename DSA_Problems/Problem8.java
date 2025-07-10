public class Problem8{
    static int first = -1;
    static int last = -1;
    public static void Occurence(int index, String str){
        
        // base case
        if(index == str.length()){
            System.out.print(first);
            System.out.print(last);
            return;
        }

        char currentcharacter = str.charAt(index);
        if(currentcharacter == 'a'){
            if(first == -1){
                
                
                first = index;
                
            }else{
                last = index;
            } 
            
            
        }
        Occurence(index+1,str);
    }
    public static void main(String args[]){
        // main function
        String str = "abaacdaefaah";
        int index = 0;
        // call the function
        Occurence(index,str);
    }
}