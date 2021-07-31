package Uncategorized;

import java.io.*;
import java.util.*;

public class acmtryouts0a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int flows = sc.nextInt();
        int[] max = new int[flows];

        for (int i = 0; i < flows; i++) {
            int flow = sc.nextInt();
            int maxn = 0;
            for (int j = 0; j < flow; j++) {
                int n = sc.nextInt();
                if (n > maxn) {
                    maxn = n;
                }
            }
            max[i] = maxn;
        }

        for (int i = 0; i < max.length; i++) {
            System.out.println(max[i]);
        }

    }
}