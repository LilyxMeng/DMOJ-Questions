package CCC;

import java.io.*;
import java.util.*;

public class ccc12j3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int j = 0; j < num; j++) {

            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }

            for (int k = 0; k < num; k++) {
                System.out.print("x");
            }

            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int j = 0; j < num; j++) {

            for (int k = 0; k < num; k++) {
                System.out.print(" ");
            }

            for (int k = 0; k < num; k++) {
                System.out.print("x");
            }

            for (int k = 0; k < num; k++) {
                System.out.print("x");
            }

            System.out.println();
        }

        for (int j = 0; j < num; j++) {

            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }

            for (int k = 0; k < num; k++) {
                System.out.print(" ");
            }

            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}