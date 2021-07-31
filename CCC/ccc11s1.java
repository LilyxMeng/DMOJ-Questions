package CCC;

import java.io.*;
import java.util.*;

public class ccc11s1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        int t = 0;
        int s = 0;

        for (int i = 0; i < lines + 1; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 't' || line.charAt(j) == 'T') {
                    t += 1;
                } else if (line.charAt(j) == 's' || line.charAt(j) == 'S') {
                    s += 1;
                }
            }
        }

        if (t > s) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }

    }
}