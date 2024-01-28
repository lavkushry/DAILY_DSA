package Array;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter the value of School :");
        int m = scan.nextInt();
        System.out.println(" Enter the value of Class :");
        int n = scan.nextInt();
        System.out.println(" Enter the value of Student :");
        int o = scan.nextInt();
        int [][][] a =new int[m][n][o];

        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("Enter the Value of School " + i + " Classroom " + j + " Student " + k);
                    a[i][j][k] = scan.nextInt();
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
