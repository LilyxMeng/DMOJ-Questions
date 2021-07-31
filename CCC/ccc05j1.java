package CCC;

import java.io.*;
import java.util.*;

public class ccc05j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int daytime = sc.nextInt();
        int evening = sc.nextInt();
        int weekend = sc.nextInt();

        double ad = -100 + daytime;
        double ae = evening * 0.15;
        double aw = weekend * 0.20;
        double bd = -250 + daytime;
        double be = evening * 0.35;
        double bw = weekend * 0.25;

        if (ad > 0) {
            ad = ad * 0.25;
        } else {
            ad = 0;
        }

        if (bd > 0) {
            bd = bd * 0.45;
        } else {
            bd = 0;
        }

        double costa = Math.round((ad + ae + aw) * 100.0) / 100.0;
        double costb = Math.round((bd + be + bw) * 100.0) / 100.0;

        System.out.println("Plan A costs " + costa);
        System.out.println("Plan B costs " + costb);

        if (costa > costb) {
            System.out.println("Plan B is cheapest.");
        } else if (costa < costb) {
            System.out.println("Plan A is cheapest.");
        } else {
            System.out.println("Plan A and B are the same price.");
        }

    }
}