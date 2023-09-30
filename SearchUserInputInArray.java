import java.util.*;
public class SearchUserInputInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.print("Enter Your Array Size : ");
            int size =sc.nextInt();

            int number[]=new int[size];
        //input for numbers
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            }
            System.out.println("Enter Number Which you found : ");
            int x=sc.nextInt();
            for(int i=0; i<number.length;i++){
                if(number[i]==x)
                System.out.println("Your Number is found on Index : "+i);
            }
        }
    }
}
