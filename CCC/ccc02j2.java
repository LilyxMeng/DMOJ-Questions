package CCC;

import java.io.*;
import java.util.*;

public class ccc02j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        while (!word.equals("quit!")) {

            if (word.length() > 3 && word.charAt(word.length() - 3) != 'a' && word.charAt(word.length() - 3) != 'e'
                    && word.charAt(word.length() - 3) != 'i' && word.charAt(word.length() - 3) != 'o'
                    && word.charAt(word.length() - 3) != 'u' && word.charAt(word.length() - 3) != 'y'
                    && word.endsWith("or")) {

                System.out.println((word.replace("or", "our")));
            } else {
                System.out.println(word);
            }
            word = sc.next();
        }

    }
}