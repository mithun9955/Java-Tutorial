import java.util.*;
public class FindGreaterFromTwoNoUsingFunction {
    public static void printGreaterOne(int a, int b){
        if(a>b){
            System.out.println("Your A is Greater :" +a);
            }else if(a<b){
                System.out.println("Your B is Greater :"+b);
            }else{
                System.out.println("Invalid");
            }
            return;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            System.out.print("Enter A number : ");
            int a =sc.nextInt();
            System.out.print("Enter B number : ");
            int b =sc.nextInt();

            printGreaterOne(a, b);
        }
    }

