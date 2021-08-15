package Uncategorized;

import java.io.*;
import java.util.*;

public class pwindsor18p7 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static int col;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        List<String> a = new ArrayList();
        for (int i = 0; i < n; i++) {
            a.add(next());
        }
        Collections.sort(a, new Comparator<String>() {
            public int compare(String x, String y) {
                String xy = x + y, yx = y + x;
                return -xy.compareTo(yx);
            }
        });
        for (String x : a) {
            System.out.print(x);
        }
    }

    static class cmp implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return Integer.compare(Math.abs(a), Math.abs(b));
        }
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
