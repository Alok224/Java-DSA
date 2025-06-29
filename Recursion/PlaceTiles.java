public class PlaceTiles{

    public static int placetiles(int n, int m){
        // base case
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // place tiles vertically
        int PlaceVertically = placetiles(n-m,m);
        // place tiles horizontally
        int PlaceHorizontally = placetiles(n-1,m);
        // return the ways
        return PlaceHorizontally + PlaceVertically;
    }

    public static void main(String[] args){
        // declare the variable
        int n = 4;
        int m = 2;
        // call the function
        int PrintPaths = placetiles(n,m);
        System.out.println(PrintPaths);
    }
}