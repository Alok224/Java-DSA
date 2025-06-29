import java.util.*;
class Patterns{
    public static void main(String[] args){
        // to print a Pattern of solid rectangle
        // firstly, take the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();
        // // now try the loop
        // for(int i = 0; i<n; i++){
        //     for (int j = 0; j<m; j++){
        //          System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // to print a pattern of hollow rectangle
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();
        // // now try the loop for this pattern
        // for(int i = 1; i <= n; i++){
        //     for (int j = 1; j <= m; j++){
        //         // firstly, I would have to apply the Condition
        //         if(i == 1 || i == n || j == 1 || j == m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // to print the pattern of half pyramid
        // now take the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();
        // // now try the for loop for this pattern
        // for(int i = 1; i<= n; i++){
        //     for(int j = 1; j<=m; j++){
        //         // now apply the Condition
        //         if(i == n || j == 1 || i == j || i>j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }  

        // to print the inverted half pyramid
        // take the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();            
        // // Now try the loop for this pattern
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        
        // to print the 180 deg rotated half pyramid
        // take the input from the user
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int m = sc.nextInt();
//         // Now try the loop for this pattern
//         for (int i = 1; i<= n; i++){
//             for (int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
// 
//             }
//             System.out.print("*");
//         }
        
        // take the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();
        // // Now try the loop for this pattern
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        // System.out.println();
        // }

        // take the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the numeber of columns: ");
        // int m = sc.nextInt();
        // // now apply the loop
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        // System.out.println();
        // }

        // take the input from the user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int m = sc.nextInt();
        // // now apply the loop
        // int k = 0;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         k = k + 1;
        //         System.out.print(k + " ");
        //     }
        // System.out.println();
        // }

        // Advanced pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        // now apply the loop for left stars
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             
//             for(int j = 1; j<=2 * (n-i); j++){
//                 System.out.print("  ");
//             }
// 
//             for(int j = 1; j <=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//     
//       }  

        // lower half
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     for(int j = 1; j<=2 * (n - i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        

        // print another Advanced pattern

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=(n-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // diamond pattern
        for(int i = 1; i<=n; i = i + 2){
            for(int j = 1; j<= (n-i)/2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}