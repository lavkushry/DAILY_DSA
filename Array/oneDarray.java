package Array;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class oneDarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the age: ");
            a[i]=scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
