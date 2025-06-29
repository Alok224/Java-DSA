public class InvitePeople{
    public static int InviteWays(int n){

        // base case
        if( n <= 1){
            return 1;
        }

        // for single 
        int single = InviteWays(n-1);
        // for pair
        int pair = (n-1) * InviteWays(n-2);

        return single + pair;
    }
    public static void main(String args[]){
        int n = 4;
        // Call the function
        int TotalNumberOfWays = InviteWays(n);
        System.out.println(TotalNumberOfWays);
    }
}