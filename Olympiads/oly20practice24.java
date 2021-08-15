package Olympiads;

import java.io.*;
import java.util.*;

public class oly20practice24 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = readInt(), N = readInt();
        List<Integer> a = new ArrayList();
        for (int i = 0; i < N; i++) {
            a.add(readInt());
        }
        Collections.sort(a, new cmp());
        int cur = 0, ans = 0;
        for (int i = 0; i < a.size(); i++) {
            if (Math.abs(a.get(i) - cur) <= T) {
                T -= Math.abs(a.get(i) - cur);
                cur = a.get(i);
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
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
