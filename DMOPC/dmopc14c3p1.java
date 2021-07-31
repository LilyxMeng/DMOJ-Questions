package DMOPC;

import java.io.*;
import java.util.*;

public class dmopc14c3p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int users = sc.nextInt();
        int times = sc.nextInt();
        int finalDay = sc.nextInt();

        for (int i = 0; i < finalDay; i++) {
            users = users * times;
        }

        System.out.println(users);

    }
}