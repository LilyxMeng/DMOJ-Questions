package Uncategorized;

import java.io.*;
import java.util.*;

public class 16bitswonly {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            long n1 = sc.nextLong();
            long n2 = sc.nextLong();
            long total = sc.nextLong();
            if (n1 * n2 == total) {
                System.out.println("POSSIBLE DOUBLE SIGMA");
            } else {
                System.out.println("16 BIT S/W ONLY");
            }
        }

    }
}