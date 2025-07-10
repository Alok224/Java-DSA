public class Problem18{
    public static int PartyPerm(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        // for single arrangements
        int single = PartyPerm(n-1);
        // for double arrangements
        int doubly = (n-1) * PartyPerm(n-2);

        return single + doubly;
    }
    public static void main(String args[]){
        // main function
        int n = 4;
        // call the function
        int ways = PartyPerm(n);
        System.out.println(ways);
    }
}