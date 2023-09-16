public class Rotate180HalfPyramidStarPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.println(" ");
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
