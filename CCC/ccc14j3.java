package CCC;

import java.io.*;
import java.util.*;

public class ccc14j3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 100;
        int b = 100;

        int games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            int roll1 = sc.nextInt();
            int roll2 = sc.nextInt();

            if (roll1 > roll2) {
                b = b - roll1;
            } else if (roll1 < roll2) {
                a = a - roll2;
            }
        }

        System.out.println(a);
        System.out.println(b);

    }
}