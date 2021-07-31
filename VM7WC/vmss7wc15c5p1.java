package VM7WC;

import java.io.*;
import java.util.*;

public class vmss7wc15c5p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String status = sc.nextLine();
        int[] mark = new int[4];
        int[] max = new int[4];
        double[] weight = new double[4];

        for (int i = 0; i < 4; i++) {
            mark[i] = sc.nextInt();
            max[i] = sc.nextInt();
            weight[i] = sc.nextDouble();
        }

        int pos = 0;
        double check = 0;

        if (status.equals("trees!")) {
            for (int i = 0; i < 4; i++) {
                if (weight[i] > check) {
                    check = weight[i];
                    pos = i;
                }
            }
            mark[pos] = max[pos];

        } else {
            for (int i = 0; i < 4; i++) {
                if (mark[i] < check) {
                    check = weight[i];
                    pos = i;
                }
            }
            mark[pos] = 0;
        }

        double total = 0;
        for (int i = 0; i < 4; i++) {
            total = total + Math.round(((double) mark[i] / max[i] * 100 * weight[i]));
        }

        System.out.println((int) Math.ceil(total));

    }
}