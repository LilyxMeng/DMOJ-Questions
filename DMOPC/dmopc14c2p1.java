package DMOPC;

import java.io.*;
import java.util.*;

public class dmopc14c2p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int[] out = new int[day];

        for (int i = 0; i < day; i++) {
            int times = sc.nextInt();
            int total = 0;

            for (int j = 0; j < times; j++) {
                int n = sc.nextInt();
                total = total + n;
                out[i] = total;

            }
        }

        for (int i = 0; i < day; i++) {
            if (out[i] == 0) {
                System.out.println("Weekend");
            } else {
                System.out.println("Day " + (i + 1) + ": " + out[i]);
            }
        }

    }
}