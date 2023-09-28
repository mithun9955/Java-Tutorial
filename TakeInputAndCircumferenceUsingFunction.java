import java.util.*;
public class TakeInputAndCircumferenceUsingFunction {
    public static double findCircumferenceOfCircle(double r){
        double cir = (2*Math.PI*r);
        System.out.println("The circumference of the circle is: "+ cir);
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter radius of the circle");
        double r = sc.nextDouble();

        findCircumferenceOfCircle(r);
    }
}
