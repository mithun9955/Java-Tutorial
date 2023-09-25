import java.util.*;
public class MultiplyTwoNoByUsingFunction {
    public static int CalculateProduct(int a, int b){
        // int product = (a*b);
        // return product;
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();

        // int product = CalculateProduct(a, b);
        // System.out.println("Product is : "+product);

        System.out.println("Product is : "+CalculateProduct(a, b));
    }
}
