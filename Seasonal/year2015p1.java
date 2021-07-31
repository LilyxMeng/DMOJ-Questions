package Seasonal;

import java.io.*;
import java.util.*;

public class year2015p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            names[i] = name;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(message.replace(">", names[i]));
        }
    }
}