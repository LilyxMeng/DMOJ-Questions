package VM7WC;

import java.io.*;
import java.util.*;

public class vmss7wc15c2p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] soldiers = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            soldiers[i] = sc.nextInt();
        }

        if (soldiers[0] <= 41 && soldiers[1] <= 41) {
            counter = counter + 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (soldiers[i - 1] <= 41 && soldiers[i] <= 41 && soldiers[i + 1] <= 41) {
                counter = counter + 1;
            }
        }

        if (soldiers[n - 2] <= 41 && soldiers[n - 1] <= 41) {
            counter = counter + 1;
        }

        System.out.println(counter);

    }
}