import java.util.*;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        System.out.print("Enter An Operator : 1=+,2=-,3=* ");
        int op=sc.nextInt();
        switch(op){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            default: System.out.println("Invalid");
        }

    }
}
