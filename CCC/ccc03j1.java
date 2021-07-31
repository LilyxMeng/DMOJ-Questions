package CCC;

import java.io.*;
import java.util.*;

public class ccc03j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int s = sc.nextInt();
        int h = sc.nextInt();

        for (int i = 0; i < t; i++) {

            for (int k = 0; k < 3; k++) {
                System.out.print("*");

                if (k < 2) {
                    for (int j = 0; j < s; j++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();

        }

        for (int i = 0; i < (2 * s + 3); i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < (s + 1); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }
}