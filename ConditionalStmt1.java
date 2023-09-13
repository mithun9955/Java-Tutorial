import java.util.*;
public class ConditionalStmt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age : ");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("You are not an adult");
        }
        else{
            System.out.println("you are an adult");
        }
    }
}
