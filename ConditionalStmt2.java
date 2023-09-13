import java.util.*;
public class ConditionalStmt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Your input number is Even");
        }
        else{
            System.out.println("Your input number is Odd");
        }
    }
}
