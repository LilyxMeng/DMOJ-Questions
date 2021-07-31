package DMOPC;

import java.io.*;
import java.util.*;

public class dmopc14c1p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int length = sc.nextInt();
        int size = sc.nextInt();

        int multiply = ((length * size) / (size * size));
        int times = (width / size);
        System.out.println(multiply * times);

    }
}