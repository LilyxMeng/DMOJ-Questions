package Uncategorized;

import java.io.*;
import java.util.*;

public class cpc21c1p1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int T = readInt(); T > 0; T--) {
            long a = readLong(), b = readLong();
            b /= gcd(a, b);
            int c2 = 0, c5 = 0;
            while ((b % 2) == 0) {
                c2++;
                b /= 2;
            }
            while (b % 5 == 0) {
                c5++;
                b /= 5;
            }
            if (b != 1) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(c2, c5));
            }
        }
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static class pair implements Comparable<pair> {
        String card;
        int cost;

        pair(String name, int num) {
            card = name;
            cost = num;
        }

        public int compareTo(pair x) {
            return card.compareTo(x.card);
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