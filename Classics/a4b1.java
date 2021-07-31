package Classics;

import java.io.*;
import java.util.*;

public class a4b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] += sc.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }

    }
}