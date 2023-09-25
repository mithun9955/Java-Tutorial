import java.util.*;
public class AverageUsingFunction {
    public static int CalculateAverage(int a, int b, int c){
        int Average = (a+b+c)/3;
        return Average;
        // return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int c=sc.nextInt();

        int Average = CalculateAverage(a, b, c);
        System.out.println("Average is : "+Average);

        // System.out.println("Product is : "+CalculateAverage(a, b, c));
    }
}
