import java.util.*;
public class Factorialloop {
    public static void CalculateFactorial(int n){

        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact=1;
        for (int i = n ;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("The factorial of "+n+" is: " +fact);
        return;
    }

       
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number whose factorial you want to calculate:");
            int n = sc.nextInt();

            CalculateFactorial(n);
        }
    }

