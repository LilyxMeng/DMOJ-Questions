package DWITE;

import java.io.*;
import java.util.*;

public class dwite08c3p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int count = 0;
            int charCount = 0;
            String sentence = sc.nextLine();
            String[] words = sentence.split("\\W+");

            for (int j = 0; j < words.length; j++) {
                charCount = 0;
                for (int k = 0; k < words[j].length(); k++) {
                    charCount += 1;
                }
                if (charCount > 3) {
                    count += 1;
                }
            }
            System.out.println(count);
        }

    }
}