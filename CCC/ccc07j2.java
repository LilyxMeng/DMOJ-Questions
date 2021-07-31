package CCC;

import java.io.*;
import java.util.*;

public class ccc07j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int end = 0;

        while (end == 0) {

            String msg = sc.nextLine();

            if (msg.equals("CU")) {
                System.out.println("see you");
            } else if (msg.equals(":-)")) {
                System.out.println("I'm happy");
            } else if (msg.equals(":-(")) {
                System.out.println("I'm unhappy");
            } else if (msg.equals(";-)")) {
                System.out.println("wink");
            } else if (msg.equals(":-P")) {
                System.out.println("stick out my tongue");
            } else if (msg.equals("(~.~)")) {
                System.out.println("sleepy");
            } else if (msg.equals("TA")) {
                System.out.println("totally awesome");
            } else if (msg.equals("CCC")) {
                System.out.println("Canadian Computing Competition");
            } else if (msg.equals("CUZ")) {
                System.out.println("because");
            } else if (msg.equals("TY")) {
                System.out.println("Thank you");
            } else if (msg.equals("YW")) {
                System.out.println("you're welcome");
            } else if (msg.equals("TTYL")) {
                System.out.println("talk to you later");
                end = 1;
            } else {
                System.out.println(msg);
            }
        }

    }
}