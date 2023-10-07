import java.util.*;
public class MultiDimensionalArraySearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array of Row : ");
        int row = sc.nextInt();
        System.out.print("Enter Array of Column :");
        int col = sc.nextInt();

        int numbers[][] = new int[row][col];
        // Fill array with elements(input)
        for (int i = 0; i < row; i++){
            for(int j=0 ; j<col ; j++){
                System.out.println(i+" "+j+" element: ");
                numbers[i][j] = sc.nextInt();
            } 
        }

        System.out.println("Enter Number that u want ro search : ");
        int x = sc.nextInt();

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location (" + i + ", " + j + ")");
            }
            }
        }

    }
}
