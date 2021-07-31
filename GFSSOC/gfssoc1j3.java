package GFSSOC;

import java.io.*;
import java.util.*;

public class gfssoc1j3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        String[] a = time.split(":");

        time = sc.nextLine();
        String[] b = time.split(":");

        int h = (Integer.parseInt(b[0]) - Integer.parseInt(a[0]));
        int m = (Integer.parseInt(b[1]) - Integer.parseInt(a[1]));
        int s = (Integer.parseInt(b[2]) - Integer.parseInt(a[2]));

        System.out.println((h * 3600) + (m * 60) + s);

    }
}