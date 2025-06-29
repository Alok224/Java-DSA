public class MazeMove{

    public static int Countpaths(int i, int j, int n, int m){
        // base case
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i == n || j == m){
            return 0;
        }
        // Move downpath
        int downpath = Countpaths(i+1,j,n,m);
        // Move rightpath
        int rightpath = Countpaths(i,j+1,n,m);
        return downpath + rightpath;
    }

    public static void main(String[] args){
        // declare the i and j
        int i = 0;
        int j = 0;
        int n = 4;
        int m = 4;
        // call the function
        int totalpaths = Countpaths(i,j,n,m);
        System.out.println(totalpaths);
    }
}