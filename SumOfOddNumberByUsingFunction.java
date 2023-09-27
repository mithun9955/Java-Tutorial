import java.util.*;
public class SumOfOddNumberByUsingFunction {
    public static void AddOddOnly(int n){
        int sum = 0;
        for (int i=1 ;i<=n; i++){
            if ((i%2)!=0){
                System.out.println("odd number is : "+i);
                sum = sum+i;
            }
        }
        System.out.println("Your Sum of Odd Number is : "+sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        AddOddOnly(n);
    }
}
