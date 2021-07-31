package CCC;

import java.io.*;
import java.util.*;

public class ccc07j3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] cases = new int[10];
        cases[0] = 100;
        cases[1] = 500;
        cases[2] = 1000;
        cases[3] = 5000;
        cases[4] = 10000;
        cases[5] = 25000;
        cases[6] = 50000;
        cases[7] = 100000;
        cases[8] = 500000;
        cases[9] = 1000000;

        int total = 0;

        int opened = sc.nextInt();

        for (int i = 0; i < opened; i++) {
            int num = sc.nextInt();
            cases[num - 1] = 0;
        }

        for (int i = 0; i < 10; i++) {
            total = total + cases[i];
        }

        total = total / (10 - opened);

        int offer = sc.nextInt();

        if (total < offer) {
            System.out.println("deal");
        } else {
            System.out.println("no deal");
        }

    }
}