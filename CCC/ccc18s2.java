import java.io.*;
import java.util.*;

public class ccc18s2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] sunflower = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sunflower[i][j] = sc.nextInt();
            }
        }

        int topDown = sunflower[1][0] - sunflower[0][0];
        int leftRight = sunflower[0][1] - sunflower[0][0];

        if (topDown > 0 && leftRight < 0) { // 90
            for (int j = n - 1; j >= 0; j--) {
                for (int i = 0; i < n; i++) {
                    System.out.print(sunflower[i][j] + " ");
                }
                System.out.println();
            }
        } else if (topDown < 0 && leftRight < 0) { // 180
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(sunflower[i][j] + " ");
                }
                System.out.println();
            }
        } else if (topDown < 0 && leftRight > 0) { // 270
            for (int j = 0; j < n; j++) {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(sunflower[i][j] + " ");
                }
                System.out.println();
            }
        } else { // 0 or 360
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sunflower[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}