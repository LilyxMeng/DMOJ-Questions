package CCC;

import java.io.*;
import java.util.*;

public class ccc21s1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    private double area;

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] heights = new int[N + 1];
        int[] widths = new int[N];
        double area = 0;

        for (int i = 0; i < N + 1; i++) {
            heights[i] = readInt();
        }

        for (int i = 0; i < N; i++) {
            widths[i] = readInt();
        }

        for (int i = 0; i < N; i++) {
            area += widths[i] * (heights[i] + heights[i + 1]) / 2.0;
        }

        if (area % 1 == 0) {
            System.out.println((int) area);

        } else {
            System.out.println(area);
        }

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}