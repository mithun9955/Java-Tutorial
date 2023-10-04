public class MultiDimensionalArrayTypeFirst {
    public static void main(String[] args) {
        int marks[][] = new int [2][2];
        marks[0][0]=97;
        marks[1][0]=95;
        marks[0][1]=93;
        marks[1][1]=98;

        // int marks[][] = {{8,6},{6,9}};

        System.out.println(marks[0][0]);
        System.out.println(marks[1][0]);
        System.out.println(marks[0][1]);
        System.out.println(marks[1][1]);

        // for(int i=0 ; i<2 ; i++){
        //     for (int j= 0 ;j < 2 ; j++){
        //         System.out.println(marks[i][j]);
        //     }
        // }

    }
}