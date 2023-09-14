import java.util.*;
public class CalculatorIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
         System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        System.out.println("Choose an Operator : +=1,-=2,*=3,/=4,%=5");
        int Operator=sc.nextInt();

        if(Operator == 1){
            System.out.println("Addition is :" +a+ "+" +b+ "=" +(a+b));
        }else if (Operator == 2) {
            System.out.println(a-b);
        }else if (Operator == 3) {
            System.out.println(a*b);
        }else if (Operator == 4) {
            System.out.println(a/b);
        }else if (Operator == 5) {
            System.out.println(a%b);
        }
    }
}
