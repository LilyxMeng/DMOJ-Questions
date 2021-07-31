package CCC;

import java.io.*;
import java.util.*;

public class ccc07j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] weight = new int[3];
        weight[0] = sc.nextInt();
        weight[1] = sc.nextInt();
        weight[2] = sc.nextInt();

        Arrays.sort(weight);

        System.out.println(weight[1]);

    }
}