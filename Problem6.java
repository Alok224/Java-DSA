public class Problem6{

    public static void TOH(int n,String source, String Helper, String Destination){
        // base case
        if(n==1){
        System.out.println("tranfered Disk" + n + " from " + source + " to " + Destination);
        return;
        }

        TOH(n-1,source,Destination,Helper);
        System.out.println("tranfered Disk" + n + " from " + source + " to " + Destination);
        TOH(n-1,Helper,source,Destination);
    }

    public static void main(String args[]){
        // main function
        // call the function
        int n = 4;
        TOH(n,"S","H","D");
    }
}