package CCC;

import java.io.*;
import java.util.*;

public class ccc15j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        int happy = 0;
        int sad = 0;

        for (int i = 0; i < message.length() - 3; i++) {
            String check = message.substring(i, i + 3);
            if (check.equals(":-)")) {
                happy = happy + 1;
            } else if (check.equals(":-(")) {
                sad = sad + 1;
            }
        }

        if (happy > sad) {
            System.out.println("happy");
        } else if (happy < sad) {
            System.out.println("sad");
        } else if (happy == 0 && sad == 0) {
            System.out.println("none");
        } else {
            System.out.println("unsure");
        }

    }
}