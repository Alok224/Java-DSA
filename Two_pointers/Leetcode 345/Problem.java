class Solution {
    public static String swap(int i, int j, String s){
        // swap
        StringBuilder sb = new StringBuilder(s);
        char charI = sb.charAt(i);
        char charJ = sb.charAt(j);
        // Now swap
        sb.setCharAt(i,charJ);
        sb.setCharAt(j,charI);
        return sb.toString();
    }


    public static boolean IsVowels(char ch){
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            if(IsVowels(s.charAt(i)) == false){
                i++;
            }
            else if(IsVowels(s.charAt(j)) == false){
                j--;
            }
            // Both are true, then swap
            else{
                // function
                s = swap(i,j,s);
                i++;
                j--;
                
            }
        }
        return s;
    }
}