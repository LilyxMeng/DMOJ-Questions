package CCC;

import java.io.*;
import java.util.*;

public class ccc09j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 91;

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sum = sum + (num1 * 1) + (num2 * 3) + (num3 * 1);

        System.out.println("The 1-3-sum is " + sum);

    }
}