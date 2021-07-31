package CCC;

import java.io.*;
import java.util.*;

public class ccc03j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int area = 100000;

        while (true) {
            int a = sc.nextInt();
            if (a == 0)
                break;

            for (int l = (int) Math.sqrt(a); l >= 1; l--) {
                if (a % l == 0) {
                    int w = a / l;
                    int p = 2 * (w + l);
                    System.out.println("Minimum perimeter is " + p + " with dimensions " + l + " x " + w);
                    break;
                }
            }
        }

    }
}