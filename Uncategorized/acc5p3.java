package Uncategorized;

import java.io.*;
import java.util.*;

public class acc5p3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cheese = sc.nextInt();
        int coupons = sc.nextInt();
        long total = 0;
        long[] difference = new long[cheese];

        for (int i = 0; i < cheese; i++) {
            long regular = sc.nextInt();
            long discount = sc.nextInt();
            total += regular;
            difference[i] = regular - discount;
        }

        Arrays.sort(difference);

        for (int i = difference.length - 1; i > difference.length - 1 - coupons; i--) {
            total -= difference[i];
        }

        System.out.println(total);

    }
}