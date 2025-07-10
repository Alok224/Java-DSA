public class Problem16{
    public static int MazeMove(int i, int j, int n, int m){
        if(i == n-1 || j == m-1){
           return 1;
        }
        int rightpath = MazeMove(i,j+1,n,m);
        int downpath = MazeMove(i+1,j,n,m);
        return rightpath + downpath;
    }
    public static void main(String args[]){
        // main function
        int n = 3;
        int m = 3;
        // call the function
        int paths = MazeMove(0,0,n,m);
        System.out.println(paths);
    }
}