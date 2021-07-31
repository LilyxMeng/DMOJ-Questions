package Uncategorized;
import java.io.*;
import java.util.*;

public class vpex1p0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int slices = sc.nextInt();
        int friends = sc.nextInt();

        System.out.println(slices / friends + " " + slices % friends);

    }
}