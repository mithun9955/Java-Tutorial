import java.util.*;
public class TableUsingFunction {
    public static void printTable(int n){
        for ( int i = 1;i<=10 ;++i){
            System.out.println(+i + " * " +n +" = " +i*n);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);//this is the way to call a function in Java
    }
}
