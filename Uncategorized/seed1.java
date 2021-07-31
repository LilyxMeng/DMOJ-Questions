package Uncategorized;

import java.io.*;
import java.util.*;

public class seed1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int[] check = new int[] { 0, 0, 0, 0, 0 };

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'B') {
                check[0] = check[0] + 1;
            } else if (word.charAt(i) == 'F') {
                check[1] = check[1] + 1;
            } else if (word.charAt(i) == 'T') {
                check[2] = check[2] + 1;
            } else if (word.charAt(i) == 'L') {
                check[3] = check[3] + 1;
            } else if (word.charAt(i) == 'C') {
                check[4] = check[4] + 1;
            }

        }

        char[] parts = new char[] { 'B', 'F', 'T', 'L', 'C' };
        boolean none = true;

        for (int i = 0; i < parts.length; i++) {
            if (check[i] == 0) {
                System.out.println(parts[i]);
                none = false;
            }
        }

        if (none == true) {
            System.out.println("NO MISSING PARTS");
        }

    }
}