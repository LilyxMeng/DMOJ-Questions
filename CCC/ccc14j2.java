package CCC;

import java.io.*;
import java.util.*;

public class ccc14j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String votes = sc.next();

        int a = 0;
        int b = 0;

        for (int i = 0; i < num; i++) {
            if (votes.charAt(i) == 'A') {
                a = a + 1;
            } else if (votes.charAt(i) == 'B') {
                b = b + 1;
            }
        }

        if (a > b) {
            System.out.println("A");
        } else if (a < b) {
            System.out.println("B");
        } else if (a == b) {
            System.out.println("Tie");
        }

    }
}