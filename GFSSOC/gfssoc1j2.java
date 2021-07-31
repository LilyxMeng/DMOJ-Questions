package GFSSOC;

import java.io.*;
import java.util.*;

public class gfssoc1j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int moves = sc.nextInt();
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves; i++) {
            String direction = sc.next();
            int change;

            if (direction.equals("North")) {
                change = sc.nextInt();
                y = y + change;
            } else if (direction.equals("East")) {
                change = sc.nextInt();
                x = x + change;
            } else if (direction.equals("South")) {
                change = sc.nextInt();
                y = y - change;
            } else if (direction.equals("West")) {
                change = sc.nextInt();
                x = x - change;
            }
        }

        System.out.println(x + " " + y);

    }
}