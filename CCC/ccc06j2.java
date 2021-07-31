package CCC;

import java.io.*;
import java.util.*;

public class ccc06j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int counter = 0;

        for (int a = 1; a <= m; a++) {

            for (int b = 1; b <= n; b++) {

                if (a + b == 10) {
                    counter += 1;
                }
            }
        }

        if (counter == 1) {
            System.out.println(("There is " + counter) + " way to get the sum 10.");
        } else {
            System.out.println("There are " + counter + " ways to get the sum 10.");
        }

    }
}