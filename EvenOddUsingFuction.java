import java.util.*;
public class EvenOddUsingFuction {
    public static void CalculateEvenOdd(int n){
    if(n%2==0){
        System.out.println("even");
        }else{
            System.out.println("odd");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();

        CalculateEvenOdd(n);
    }
}
