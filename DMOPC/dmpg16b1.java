package DMOPC;

import java.io.*;
import java.util.*;

public class dmpg16b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        total += sc.nextInt() * 5;
        total += sc.nextInt() * 10;
        total += sc.nextInt() * 25;
        total += sc.nextInt() * 100;
        total += sc.nextInt() * 200;

        System.out.println(total);

    }
}