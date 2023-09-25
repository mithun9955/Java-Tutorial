import java.util.*;
public class AddTwoNoByUsingFunction {
    public static int CalculateSum(int a, int b){
        int sum=(a+b);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter A value : ");
        int a =sc.nextInt();
        System.out.println("Enter B value : ");
        int b =sc.nextInt();

        int sum = CalculateSum(a, b);
        System.out.println("Addition is  : "+sum);

    }
}
