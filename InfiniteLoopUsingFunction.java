import java.util.Scanner;

public class InfiniteLoopUsingFunction {
    public static void infiniteLoop(int n){
        while (true){
            System.out.println(n);
            n++;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        infiniteLoop(n);
    }
}


