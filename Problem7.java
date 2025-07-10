public class Problem7{
    public static void reverse(int index,String str){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverse(index-1, str);
       
    }
    public static void main(String args[]){
        // main function
        String str = "abcd";
        reverse(str.length() - 1,str);
    }
}