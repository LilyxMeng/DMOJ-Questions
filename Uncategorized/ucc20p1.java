package Uncategorized;

import java.io.*;
import java.util.*;

public class ucc20p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        char[] row1 = new char[row];
        char[] row2 = new char[row];
        int safe = 0;

        String n1 = sc.next();
        String n2 = sc.next();

        for (int i = 0; i < row; i++) {
            row1[i] = n1.charAt(i);
        }

        for (int i = 0; i < row; i++) {

            row2[i] = n2.charAt(i);
        }

        for (int i = 0; i < row; i++) {
            if (row1[i] == '0' && row2[i] == '0') {
                safe += 1;
            }
        }

        System.out.println(safe);

    }
}