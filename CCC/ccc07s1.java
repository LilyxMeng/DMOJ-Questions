package CCC;

import java.io.*;
import java.util.*;

public class ccc07s1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int electionY = 2007;
        int electionM = 2;
        int electionD = 27;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            if (electionY - y > 18) {
                System.out.println("Yes");
            } else if (electionY - y == 18 && electionM > m) {
                System.out.println("Yes");
            } else if (electionY - y == 18 && electionM == m && electionD >= d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}