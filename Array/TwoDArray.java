package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter the value of Class :");
        int m = scan.nextInt();
        System.out.println(" Enter the value of School :");
        int n = scan.nextInt();
        int a[][]=new int[m][n];

        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter the Age of class "+ i+ " Student "+j);
                a[i][j]=scan.nextInt();
            }
        }
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
