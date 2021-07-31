package CCC;

import java.io.*;
import java.util.*;

public class ccc05j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rsa = 0;

        for (int i = num1; i <= num2; i++) {
            int count = 0;
            int div = 1;

            for (int j = 0; j < i; j++) {
                if (i % div == 0) {
                    count = count + 1;
                    div = div + 1;
                } else {
                    div = div + 1;
                }
            }

            if (count == 4) {
                rsa = rsa + 1;

            }
        }

        System.out.println("The number of RSA numbers between " + num1 + " and " + num2 + " is " + rsa);

    }
}