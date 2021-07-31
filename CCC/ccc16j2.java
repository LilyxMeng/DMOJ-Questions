package CCC;

import java.io.*;
import java.util.*;

public class ccc16j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean magic = true;
        int sum = 0;
        int previous = arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            if (previous != sum) {
                magic = false;
                break;
            }
            sum = 0;
        }

        if (magic) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }

    }
}