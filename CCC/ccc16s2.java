package CCC;

import java.io.*;
import java.util.*;

public class ccc16s2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int question = sc.nextInt();
        int n = sc.nextInt();
        int[] d = new int[n];
        int[] p = new int[n];
        int[] speeds = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(d);
        Arrays.sort(p);

        if (question == 1) {
            for (int i = 0; i < n; i++) {
                int min = 0;
                if (d[d.length - 1 - i] > p[p.length - 1 - i]) {
                    min = d[d.length - 1 - i];
                } else {
                    min = p[p.length - 1 - i];
                }
                speeds[i] = min;
            }
        }

        if (question == 2) {
            for (int i = 0; i < n; i++) {
                int max = 0;
                if (d[i] > p[p.length - 1 - i]) {
                    max = d[i];
                } else {
                    max = p[p.length - 1 - i];
                }
                speeds[i] = max;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += speeds[i];
        }

        System.out.println(sum);

    }
}