package VM7WC;

import java.io.*;
import java.util.*;

public class vmss7wc15c1p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();

        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < 3; i++) {
            int n = number.charAt(i) - 48;
            one = one + n;
        }

        System.out.println();
        for (int i = 4; i < 7; i++) {
            int n = number.charAt(i) - 48;
            two = two + n;
        }

        for (int i = 8; i < 12; i++) {
            int n = number.charAt(i) - 48;
            three = three + n;
        }

        if (one == two && two == three) {
            System.out.println("Goony!");
        } else {
            System.out.println("Pick up the phone!");
        }

    }
}