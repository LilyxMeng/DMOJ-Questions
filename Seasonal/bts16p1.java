package Seasonal;

import java.io.*;
import java.util.*;

public class bts16p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String essay = sc.nextLine();

        String temp = essay.replace(" ", "");

        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < temp.length(); i++) {

            if (temp.charAt(i) >= 97) {
                lowercase = lowercase + 1;
            } else {
                uppercase = uppercase + 1;
            }
        }

        if (lowercase > uppercase) {
            System.out.println(essay.toLowerCase());
        } else if (lowercase < uppercase) {
            System.out.println(essay.toUpperCase());
        } else if (lowercase == uppercase) {
            System.out.println(essay);
        }

    }
}