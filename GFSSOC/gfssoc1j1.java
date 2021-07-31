package GFSSOC;

import java.io.*;
import java.util.*;

public class gfssoc1j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fheight = sc.nextInt();
        int plushies = sc.nextInt();
        int num = 0;

        for (int i = 0; i < plushies; i++) {
            int pheight = sc.nextInt();

            if (fheight <= pheight) {
                num = num + 1;
            }
        }

        System.out.println(num);

    }
}