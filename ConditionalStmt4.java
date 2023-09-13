import java.util.*;
public class ConditionalStmt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(1 == a){
            System.out.println("Hello");
        }else if(2==a){
            System.out.println("Nameste");
        }
        else if(3==a){
            System.out.println("Bounjor");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
