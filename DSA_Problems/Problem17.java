public class Problem17{
    public static int PlaceTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        // for vertically Place
        int verticalplace = PlaceTiles(n-m,m);
        int horizontalplace = PlaceTiles(n-1,m);
        return verticalplace + horizontalplace;
    }
    public static void main(String args[]){
        // main function
        int n = 4;
        int m = 2;
        // call the function
        int result = PlaceTiles(n,m);
        System.out.println(result);
    }
}