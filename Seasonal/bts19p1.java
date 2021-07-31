package Seasonal;

import java.io.*;
import java.util.*;

public class bts19p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            words[i] = word;
        }

        String replace = sc.next();
        int current = 1000;

        for (int i = 0; i < n; i++) {
            if (words[i].length() <= replace.length()) {
                if (Math.abs(words[i].length() - replace.length()) < Math.abs(current - replace.length())) {
                    current = words[i].length();
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (words[i].length() == current) {
                System.out.println(words[i]);
            }
        }

    }
}