package CCC;

import java.io.*;
import java.util.*;

public class ccc01j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int m = sc.nextInt();
        boolean pass = false;
        for (int i = 0; i < m; i++) {
            if (x * i % m == 1) {
                System.out.println();
                pass = true;
                System.out.println(i);
            }
        }

        if (!pass) {
            System.out.println("No such integer exists.");
        }

    }
}