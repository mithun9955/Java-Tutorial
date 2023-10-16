import java.util.*;


public class TransposeOfMatrix {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of Row : ");
      int n = sc.nextInt();
      System.out.println("Enter Size or Column : ");
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      //input
      System.out.println("Enter the elements of matrix : ");
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }
}
