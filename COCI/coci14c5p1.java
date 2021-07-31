package COCI;

import java.io.*;
import java.util.*;

public class coci14c5p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] n = new int[8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (i + 3 < 8) {
                if (n[i] + n[i + 1] + n[i + 2] + n[i + 3] > count) {
                    count = n[i] + n[i + 1] + n[i + 2] + n[i + 3];
                }

            } else if (i + 3 == 8) {
                if (n[i] + n[i + 1] + n[i + 2] + n[0] > count) {
                    count = n[i] + n[i + 1] + n[i + 2] + n[0];
                }
            } else if (i + 3 == 9) {
                if (n[i] + n[i + 1] + n[0] + n[1] > count) {
                    count = n[i] + n[i + 1] + n[0] + n[1];
                }
            } else if (i + 3 == 10) {
                if (n[i] + n[0] + n[1] + n[2] > count) {
                    count = n[i] + n[0] + n[1] + n[2];
                }

            }

        }

        System.out.println(count);

    }
}