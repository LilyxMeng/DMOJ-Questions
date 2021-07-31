package CCC;

import java.io.*;
import java.util.*;

public class ccc15s1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers = sc.nextInt();
        int[] total = new int[0];

        for (int i = 0; i < numbers; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                total = Arrays.copyOf(total, total.length - 1);
            } else {
                total = Arrays.copyOf(total, total.length + 1);
                total[total.length - 1] = n;
            }
        }

        int sum = 0;
        for (int i = 0; i < total.length; i++) {
            sum = sum + total[i];
        }

        System.out.println(sum);

    }
}