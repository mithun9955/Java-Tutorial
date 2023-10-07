import java.util.*;
public class MultiDimensionalTakingInputAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of size in array : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers =new int[row][col];
        //input 
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
               numbers[i][j] = sc.nextInt();
            }
        }
        //print 2D Array
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(numbers[i][j] +"  ");
            }
            System.out.println();
        }
        
    }
}
