package CCC;

import java.io.*;
import java.util.*;

public class ccc04j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yr1 = sc.nextInt();
        int yr2 = sc.nextInt();

        int counter = 0;

        for (int i = yr1; i <= yr2; i++) {

            if (counter % 4 == 0 && counter % 2 == 0 && counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("All positions change in year " + i);
            }

            counter += 1;

        }

    }
}