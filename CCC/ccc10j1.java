package CCC;

import java.io.*;
import java.util.*;

public class ccc10j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ways = 0;

        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= 5; j++) {

                if (i + j == num && (i <= j)) {
                    ways = ways + 1;
                }
            }
        }

        System.out.println(ways);

    }
}