import java.util.*;
public class TakeInputNameAndPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Name Size : ");
        int size = sc.nextInt();
        
        String names[] = new String[size];

        //input
        for(int i=0 ; i<size ; i++ ){
            names[i] = sc.next();
        }
        
        //output
        for(int i=0 ; i<names.length ; i++){
            System.out.println("Your "  +(i+1)+  " Name is : " +names[i]);
        }
    }
}
