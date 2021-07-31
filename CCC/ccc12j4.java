package CCC;

import java.io.*;
import java.util.*;

public class ccc12j4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String code = sc.next();

        char[] alphabet = new char[26];
        int ascii = 65;
        String output = "";
        int sub;
        int counter = 0;

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (ascii);
            ascii = ascii + 1;
        }

        for (int j = 0; j < code.length(); j++) {
            counter = counter + 1;

            for (int i = 0; i < 26; i++) {
                if (code.charAt(j) == alphabet[i]) {
                    sub = 3 * counter + num;

                    if ((code.charAt(j) - sub < 65)) {
                        sub = code.charAt(j) - sub + 26;

                        for (int k = 0; k < 26; k++) {
                            if ((char) sub == alphabet[k]) {
                                output = output + alphabet[k];
                            }
                        }

                    } else if ((code.charAt(j) - sub >= 65)) {
                        sub = code.charAt(j) - sub;

                        for (int k = 0; k < 26; k++) {
                            if ((char) sub == alphabet[k]) {
                                output = output + alphabet[k];

                            }
                        }
                    }
                }
            }
        }

        System.out.println(output);

    }
}