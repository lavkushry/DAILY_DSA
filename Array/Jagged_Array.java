package Array;

import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[][][] a= new int[2][][];
        a[0] =new int[3][];
        a[1] =new int[2][];

        a[0][0]=new int[3];
        a[0][1]=new int[2];
        a[0][2]=new int[5];

        a[1][0]=new int[1];
        a[1][1]=new int[2];

        //Input of jagged Array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("Enter the School "+i+" Class "+j+" Student "+k);
                    a[i][j][k]=scan.nextInt();
                }
            }
        }

        //Output of jagged Array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k]+ " ");
                }
                System.out.println( );
            }
            System.out.println( );
        }

    }

}
