package Uncategorized;

import java.io.*;
import java.util.*;

public class ucc20p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int routes = sc.nextInt();
        int[] time = new int[routes];

        for (int i = 0; i < routes; i++) {
            int path = sc.nextInt();
            int total = 0;
            for (int j = 0; j < path; j++) {
                total += sc.nextInt();
            }
            time[i] = total;
        }

        int shortest = 999999999;
        for (int i = 0; i < time.length; i++) {
            if (time[i] < shortest) {
                shortest = time[i];
            }
        }

        System.out.println(shortest);

    }
}