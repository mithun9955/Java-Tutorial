import java.util.*;
public class TakingInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your 1D Array Size : ");
        int size=sc.nextInt();
        int number []=new int[size];
        //input
        for(int i=0;i<size;i++){
            System.out.println("Enter the Value : ");
            number[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println("Your input is : "+number[i]);
        }

    }
}
