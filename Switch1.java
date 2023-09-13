import java.util.*;
public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1,2,3 : ");
        int buttom=sc.nextInt();
        switch(buttom){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bounjor");
            break;
            default: System.out.println("Invalid Input!");
        }
    }
}
