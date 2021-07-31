package Uncategorized;

import java.io.*;
import java.util.*;

public class stnbd1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ren = sc.nextInt();
        boolean strongest = true;

        for (int i = 0; i < n - 1; i++) {
            int power = sc.nextInt();

            if (power >= ren) {
                strongest = false;
            }
        }

        if (strongest) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}