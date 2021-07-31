package DMOPC;

import java.io.*;
import java.util.*;

public class dmopc14c4p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String decrypted = sc.nextLine();
        int length = decrypted.length();
        char[] encrypted = new char[length];
        String order = " 0123456789ABCDEFGHIJKLMNOPQ";
        String letters = "9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < decrypted.length(); i++) {
            for (int j = 0; j < order.length(); j++) {
                if (decrypted.charAt(i) == order.charAt(j)) {
                    encrypted[i] = letters.charAt(j - 1);
                }
            }
        }

        for (int i = 0; i < encrypted.length; i++) {
            System.out.print((encrypted[i]));
        }

    }
}