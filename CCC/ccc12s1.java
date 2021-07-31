package CCC;

import java.io.*;
import java.util.*;

public class ccc12s1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int one;
        int two;
        int three;
        int count = 0;

        for (int i = 1; i < max; i++) {
            one = i;

            for (int j = 1; j < max; j++) {
                two = j;

                for (int k = 1; k < max; k++) {
                    three = k;

                    if (one < two && two < three) {
                        count = count + 1;
                    }
                }
            }
        }

        System.out.println(count);

    }
}