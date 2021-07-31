package CCC;

import java.io.*;
import java.util.*;

public class ccc21j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        int p = 5 * b - 400;

        if (p > 100) {
            System.out.println(p);
            System.out.println(-1);
        } else if (p < 100) {
            System.out.println(p);
            System.out.println(1);
        } else {
            System.out.println(p);
            System.out.println(0);
        }

    }
}