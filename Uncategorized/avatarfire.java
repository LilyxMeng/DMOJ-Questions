package Uncategorized;

import java.io.*;
import java.util.*;

public class avatarfire {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int leaves = sc.nextInt();
        int[] n = new int[total];

        for (int i = 0; i < total; i++) {
            n[i] = sc.nextInt();
        }

        Arrays.sort(n);

        for (int i = 0; i < leaves; i++) {
            n[i] *= 2;
        }

        int min = 999999999;
        for (int i = 0; i < total; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println(min);

    }
}