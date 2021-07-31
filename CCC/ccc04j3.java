package CCC;

import java.io.*;
import java.util.*;

public class ccc04j3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int adj = sc.nextInt();
        int noun = sc.nextInt();

        String[] adjectives = new String[adj];
        String[] nouns = new String[noun];

        for (int i = 0; i < adj; i++) {
            adjectives[i] = sc.next();
        }

        for (int i = 0; i < noun; i++) {
            nouns[i] = sc.next();
        }

        for (int i = 0; i < adj; i++) {

            for (int j = 0; j < noun; j++) {
                System.out.println(adjectives[i] + " as " + nouns[j]);
            }
        }

    }
}