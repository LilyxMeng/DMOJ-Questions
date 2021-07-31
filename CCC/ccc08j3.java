package CCC;

import java.io.*;
import java.util.*;

public class ccc08j3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] letter = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '-', '.' };

        int[] x = new int[] { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5,
                6 };

        int[] y = new int[] { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5,
                5 };

        int xlocation = 1;
        int ylocation = 1;
        int movement = 0;

        String location = sc.nextLine();

        for (int i = 0; i < location.length(); i++) {

            for (int j = 0; j < letter.length; j++) {
                if (location.charAt(i) == letter[j]) {
                    movement = movement + (Math.abs(xlocation - x[j]));
                    movement = movement + (Math.abs(ylocation - y[j]));

                    xlocation = (x[j]);
                    ylocation = (y[j]);
                }
            }

        }

        movement = movement + (Math.abs(xlocation - x[29]));
        movement = movement + (Math.abs(ylocation - y[29]));

        System.out.println(movement);

    }
}