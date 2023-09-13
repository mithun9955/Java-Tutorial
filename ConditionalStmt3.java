import java.util.*;
public class ConditionalStmt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter your Second Number : ");
        int b=sc.nextInt();
        if(a<b){
            System.out.println("Second No is Greater");
        }
        else if(a>b){
            System.out.println("First No is Greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
