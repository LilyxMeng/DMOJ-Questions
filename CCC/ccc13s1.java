package CCC;

import java.io.*;
import java.util.*;

public class ccc13s1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        boolean test = false;

        while (test == false) {

            year += 1;
            int counter = 0;
            boolean exit = false;
            String testYear = String.valueOf(year);
            for (int i = 0; i < testYear.length(); i++) {
                for (int j = 0; j < testYear.length(); j++) {
                    if (testYear.charAt(i) == testYear.charAt(j) && i != j) {
                        exit = true;
                        break;
                    }

                    if (exit)
                        break;

                }
            }

            if (exit == false) {
                System.out.println(year);
                test = true;
            }
        }

    }
}