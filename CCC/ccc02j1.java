package CCC;

import java.io.*;
import java.util.*;

public class ccc02j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println(" * * *");

        } else if (n == 1) {

            System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println();

        } else if (n == 2) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*");
            }

            System.out.println(" * * *");

        } else if (n == 3) {
            System.out.println(" * * *");
            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println(" * * *");

        } else if (n == 4) {

            System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println();

        } else if (n == 5) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*");
            }

            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println(" * * *");

        } else if (n == 6) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*");
            }

            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println(" * * *");

        } else if (n == 7) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println();
            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println();

        } else if (n == 8) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println(" * * *");

        } else if (n == 9) {
            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("*     *");
            }

            System.out.println(" * * *");

            for (int i = 0; i < 3; i++) {
                System.out.println("      *");
            }

            System.out.println(" * * *");

        }
    }
}